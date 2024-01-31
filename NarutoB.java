import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NarutoB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NarutoB extends Actor
{
    /**
     * Act - do whatever the NarutoB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkW();
        checkS();
        checkD();
        checkA();
    }
    public NarutoB(){
        
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("W")) {
            setImage(new NarutoB().getImage());
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("S")) {
            setImage(new NarutoF().getImage());
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("D")) {
            setImage(new NarutoR().getImage());
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("A")) {
            setImage(new NarutoL().getImage());
            setLocation(getX()-2,getY());
        }
    }
}
