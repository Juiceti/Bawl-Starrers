import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pbullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pbullet extends Actor
{
    /**
     * Act - do whatever the Pbullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Pbullet(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /20, image.getHeight() /20); setImage(image);
    }
}
