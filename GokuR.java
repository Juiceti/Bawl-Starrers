import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GokuR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GokuR extends Actor
{
    /**
     * Act - do whatever the GokuR wants to do. This method is called whenever
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
        if (Greenfoot.isKeyDown("W")) {
            setImage(new GokuB().getImage());
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("S")) {
            setImage(new GokuF().getImage());
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("D")) {
            setImage(new GokuR().getImage());
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("A")) {
            setImage(new GokuL().getImage());
            setLocation(getX()-2,getY());
        }
    }
}
