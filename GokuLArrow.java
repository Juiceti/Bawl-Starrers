import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GokuLArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GokuLArrow extends Actor
{
    /**
     * Act - do whatever the GokuLArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkW();
        checkS();
        checkA();
        checkD();
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("up")) {
            setImage(new GokuBArrow().getImage());
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("down")) {
            setImage(new GokuFArrow().getImage());
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("right")) {
            setImage(new GokuRArrow().getImage());
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("left")) {
            setImage(new GokuLArrow().getImage());
            setLocation(getX()-2,getY());
        }
    }
}
