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
        checkW();
        checkD();
        checkS();
        checkA();
    }
    public LuffyF(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
    public void checkW(){
        if (Greenfoot.isKeyDown("W") && this != null){
            getWorld().addObject(new LuffyB(),getX(),getY()-2);
            getWorld().removeObject(this);
        }
    }
    public void checkS(){
        if (Greenfoot.isKeyDown("S") && this != null){
            getWorld().addObject(new LuffyF(), getX(), getY()+2);
            getWorld().removeObject(this);
        }
    }
    public void checkD(){
        if (Greenfoot.isKeyDown("D")&& this != null){
            getWorld().addObject(new LuffyR(),getX()+2,getY());
            getWorld().removeObject(this);
        }
    }
    public void checkA(){
        if (Greenfoot.isKeyDown("A")&& this != null){
            getWorld().addObject(new LuffyL(),getX()-2,getY());
            getWorld().removeObject(this);
        }
    }
}
