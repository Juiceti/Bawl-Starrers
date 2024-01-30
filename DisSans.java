import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisSans here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisSans extends Actor
{
    /**
     * Act - do whatever the DisSans wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
    public DisSans(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("W")||Greenfoot.isKeyDown("up")) {
            setImage(new SansB().getImage());
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("S")||Greenfoot.isKeyDown("down")) {
            setImage(new DisSans().getImage());
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("D")||Greenfoot.isKeyDown("right")) {
            setImage(new SansR().getImage());
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("A")||Greenfoot.isKeyDown("left")) {
            setImage(new SansL().getImage());
            setLocation(getX()-2,getY());
        }
    }
}
