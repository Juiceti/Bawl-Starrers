import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisCat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisCat extends Actor
{
    /**
     * Act - do whatever the DisCat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public DisCat(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("W")||Greenfoot.isKeyDown("up")) {
            setImage(new CatB().getImage());
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("S")||Greenfoot.isKeyDown("down")) {
            setImage(new DisCat().getImage());
            setLocation(getX(),getY()+2);
        }
    }
    public void checkD() {
        if (Greenfoot.isKeyDown("D")||Greenfoot.isKeyDown("right")) {
            setImage(new CatR().getImage());
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("A")||Greenfoot.isKeyDown("left")) {
            setImage(new CatL().getImage());
            setLocation(getX()-2,getY());
        }
    }
}
