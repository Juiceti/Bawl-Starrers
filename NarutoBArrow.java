import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NarutoBArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NarutoBArrow extends Actor
{
    /**
     * Act - do whatever the NarutoBArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkW();
        checkS();
        checkD();
        checkA();
    }
    public NarutoBArrow(){
        
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("up")) {
            setImage(new NarutoBArrow().getImage());
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("down")) {
            setImage(new NarutoFArrow().getImage());
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("right")) {
            setImage(new NarutoRArrow().getImage());
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("left")) {
            setImage(new NarutoLArrow().getImage());
            setLocation(getX()-2,getY());
        }
    }
}
