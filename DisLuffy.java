import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisLuffy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisLuffy extends Actor
{
    /**
     * Act - do whatever the DisLuffy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
    public DisLuffy(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("W")) {
            setImage(new LuffyB().getImage());
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("S")) {
            setImage(new DisLuffy().getImage());
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("D")) {
            setImage(new LuffyR().getImage());
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("A")) {
            setImage(new LuffyL().getImage());
            setLocation(getX()-2,getY());
        }
    }
    public void checkUp(){
        if(Greenfoot.isKeyDown("up")){
            setImage(new LuffyB().getImage());
            setLocation(getX(),getY()-2);
        }
    }
    public void checkDown(){
        if(Greenfoot.isKeyDown("down")){
            setImage(new DisLuffy().getImage());
            setLocation(getX(),getY()+2);
        }
    }
    public void checkRight(){
        if(Greenfoot.isKeyDown("right")){
            setImage(new LuffyR().getImage());
            setLocation(getX()+2,getY());
        }
    }
    public void checkLeft(){
        if(Greenfoot.isKeyDown("left")){
            setImage(new LuffyL().getImage());
            setLocation(getX()-2,getY());
        }
    }
}
