import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LuffyF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LuffyF extends Actor
{
    /**
     * Act - do whatever the LuffyF wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkS();
        checkW();
        checkD();
        checkA();
    }
    public LuffyF(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("W")) {
            GreenfootImage image = new GreenfootImage("Luffy_behind.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("S")) {
            GreenfootImage image = new GreenfootImage("Luffy_front.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("D")) {
            GreenfootImage image = new GreenfootImage("Luffy_right.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("A")) {
            GreenfootImage image = new GreenfootImage("Luffy_left.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX()-2,getY());
        }
    }
}
