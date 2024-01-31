import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CatBArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CatBArrow extends Actor
{
    /**
     * Act - do whatever the CatBArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkW();
        checkA();
        checkS();
        checkD();
    }
    public CatBArrow(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("up")) {
            setImage(new CatBArrow().getImage());
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("down")) {
            setImage(new CatFArrow().getImage());
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("right")) {
            setImage(new CatRArrow().getImage());
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("left")) {
            setImage(new CatLArrow().getImage());
            setLocation(getX()-2,getY());
        }
    }
}
