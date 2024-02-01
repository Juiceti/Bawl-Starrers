import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisLuffy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisLuffy extends Actor
{
    public boolean newLuffy = false;
    /**
     * Act - do whatever the DisLuffy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        selection();
    }
    public DisLuffy(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
    public void selection(){
        if(Greenfoot.mouseClicked(this)){
            BrawlChoose world = (BrawlChoose) getWorld();
            int currentPlayer = world.getPlayer();
            world.setPlayer(currentPlayer + 1);
            newLuffy = true;
            //Greenfoot.setWorld(new Lobby());
            //getWorld().addObject(new LuffyF(),100,100);
        }
    }
}
