import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SansFArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SansFArrow extends Actor
{
    /**
     * Act - do whatever the SansFArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkW();
        checkA();
        checkS();
        checkD();
    }
    public SansFArrow(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("up")) {
            setImage(new SansBArrow().getImage());
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("down")) {
            setImage(new SansFArrow().getImage());
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("right")) {
            setImage(new SansRArrow().getImage());
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("left")) {
            setImage(new SansLArrow().getImage());
            setLocation(getX()-2,getY());
        }
    }
}