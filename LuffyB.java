import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LuffyB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LuffyB extends Actor
{
    /**
     * Act - do whatever the LuffyB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public LuffyB(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
}
