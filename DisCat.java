import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisCat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisCat extends Actor
{
    public boolean newCat=true;
    /**
     * Act - do whatever the DisCat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        selection();
    }
    public DisCat(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("W")||Greenfoot.isKeyDown("up")) {
            GreenfootImage image = new GreenfootImage("Cat_behind.png");
            setImage(image);
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("S")||Greenfoot.isKeyDown("down")) {
            setImage(new DisCat().getImage());
            setLocation(getX(),getY()+2);
        }
    }
    public void checkD() {
        if (Greenfoot.isKeyDown("D")||Greenfoot.isKeyDown("right")) {
            GreenfootImage image = new GreenfootImage("Cat_right.png");
            setImage(image);
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("A")||Greenfoot.isKeyDown("left")) {
            GreenfootImage image = new GreenfootImage("Cat_left.png");
            setImage(image);
            setLocation(getX()-2,getY());
        }
    }
    public void selection(){
        if(Greenfoot.mouseClicked(this)){
            BrawlChoose world = (BrawlChoose) getWorld();
            Map world1 = (Map) getWorld();
            int currentPlayer = world.getPlayer();
            world.setPlayer(currentPlayer + 1);
            
            //Greenfoot.setWorld(new Lobby());
            //getWorld().addObject(new CatF(),100,100);
        }
    }
}
