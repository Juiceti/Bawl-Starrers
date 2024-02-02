import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GokuFArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GokuFArrow extends Actor
{
    /**
     * Act - do whatever the GokuFArrow wants to do. This method is called whenever
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
            GreenfootImage image = new GreenfootImage("Goku_behind.png");
            setImage(image);
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("down")) {
            GreenfootImage image = new GreenfootImage("Goku_front.png");
            setImage(image);
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("right")) {
            GreenfootImage image = new GreenfootImage("Goku_right.png");
            setImage(image);
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("left")) {
            GreenfootImage image = new GreenfootImage("Goku_left.png");
            setImage(image);
            setLocation(getX()-2,getY());
        }
    }
}
