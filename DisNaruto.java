import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisNaruto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisNaruto extends Actor
{
    /**
     * Act - do whatever the DisNaruto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
    public DisNaruto(){
      
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("W")||Greenfoot.isKeyDown("up")) {
            GreenfootImage image = new GreenfootImage("NarutoB.png");
            // image.scale();
            setImage(image);
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("S")||Greenfoot.isKeyDown("down")) {
            GreenfootImage image = new GreenfootImage("NarutoF.png");
            // image.scale();
            setImage(image);
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("D")||Greenfoot.isKeyDown("right")) {
            GreenfootImage image = new GreenfootImage("NarutoR.png");
            // image.scale();
            setImage(image);
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("A")||Greenfoot.isKeyDown("left")) {
            GreenfootImage image = new GreenfootImage("NarutoL.png");
            // image.scale();
            setImage(image);
            setLocation(getX()-2,getY());
        }
    }
}
