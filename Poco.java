import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poco extends Actor
{
    /**
     * Act - do whatever the Poco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkMove();
    }
    public Poco(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /5, image.getHeight() /5); setImage(image);
    }
    public void checkMove(){
        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX() +2, getY());
        }
        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX() -2, getY());
        }
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX() , getY() - 2);
        }
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()  + 2);
        }
    }
}
