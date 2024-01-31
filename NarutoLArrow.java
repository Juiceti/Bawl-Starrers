import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NarutoLArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NarutoLArrow extends Actor
{
    /**
     * Act - do whatever the NarutoLArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkW();
        checkS();
        checkD();
        checkA();
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("up")) {
            setImage(new NarutoBArrow().getImage());
            setLocation(getX(),getY()-2);
        }
    }
    public NarutoLArrow(){
        
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
        if (Greenfoot.isKeyDown("A")||Greenfoot.isKeyDown("left")) {
            setImage(new NarutoLArrow().getImage());
            setLocation(getX()-2,getY());
        }
    }
}
