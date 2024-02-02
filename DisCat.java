import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisCat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisCat extends Actor
{
    public boolean newCat=false;
    
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
    public void selection(){
        if(!Greenfoot.mouseClicked(this)){
            BrawlChoose world = (BrawlChoose) getWorld();
            int currentPlayer = world.getPlayer();
            if(currentPlayer == 3){
                getWorld().removeObject(this);
            }
        }
        else{
            BrawlChoose world = (BrawlChoose) getWorld();
            //Map world1 = () getWorld();
            int currentPlayer = world.getPlayer();
            if(currentPlayer == 1){
                world.addObject(new CatF(), 100, 100);
            }
            else{
                world.addObject(new CatFArrow(), 700, 500);
            }
            getWorld().removeObject(this);
            world.setPlayer(currentPlayer + 1);
        }
    }
    public boolean getCat(){
        return newCat;
    }
}
