import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IchiFArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IchiFArrow extends Actor
{
    /**
     * Act - do whatever the IchiFArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkW();
        checkS();
        checkA();
        checkD();
    }
    public IchiFArrow(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("up")) {
            GreenfootImage image = new GreenfootImage("Ichigo_behind.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("down")) {
            GreenfootImage image = new GreenfootImage("Ichigo_Front.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("right")) {
            GreenfootImage image = new GreenfootImage("Ichigo_right.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("left")) {
            GreenfootImage image = new GreenfootImage("Ichigo_left.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX()-2,getY());
        }
    }
}
