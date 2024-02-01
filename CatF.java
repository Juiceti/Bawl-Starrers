import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CatF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CatF extends Actor
{
    /**
     * Act - do whatever the CatF wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkW();
        checkS();
        checkA();
        checkD();
    }
    public CatF(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("W")) {
            GreenfootImage image = new GreenfootImage("Cat_behind.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("S")) {
            GreenfootImage image = new GreenfootImage("Cat_front.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("D")) {
            GreenfootImage image = new GreenfootImage("Cat_right.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("A")) {
            GreenfootImage image = new GreenfootImage("Cat_left.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX()-2,getY());
        }
    }
}
