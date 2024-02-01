import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisGoku here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisGoku extends Actor
{
    /**
     * Act - do whatever the DisGoku wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        selection();
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("W")||Greenfoot.isKeyDown("up")) {
            GreenfootImage image = new GreenfootImage("Goku_front.png");
            setImage(image);
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("S")||Greenfoot.isKeyDown("down")) {
            setImage(new DisGoku().getImage());
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("D")||Greenfoot.isKeyDown("right")) {
            GreenfootImage image = new GreenfootImage("Goku_front.png");
            setImage(image);
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("A")||Greenfoot.isKeyDown("left")) {
            GreenfootImage image = new GreenfootImage("Goku_front.png");
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
            if(world1.playerCounter == 2){
                world1.player1 = "Goku";
            }
            else if(world1.playerCounter == 3){
                world1.player2 = "Goku";
            }
            //Greenfoot.setWorld(new Lobby());
            //getWorld().addObject(new GokuF(),100,100);
        }
    }
}
