import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LuffyRArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LuffyRArrow extends Actor
{
    /**
     * Act - do whatever the LuffyRArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkUp();
        checkDown();
        checkLeft();
        checkRight();
    }
    public LuffyRArrow(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
    public void checkUp(){
        if(Greenfoot.isKeyDown("up")){
            setImage(new LuffyBArrow().getImage());
            setLocation(getX(),getY()-2);
        }
    }
    public void checkDown(){
        if(Greenfoot.isKeyDown("down")){
            setImage(new LuffyFArrow().getImage());
            setLocation(getX(),getY()+2);
        }
    }
    public void checkRight(){
        if(Greenfoot.isKeyDown("right")){
            setImage(new LuffyRArrow().getImage());
            setLocation(getX()+2,getY());
        }
    }
    public void checkLeft(){
        if(Greenfoot.isKeyDown("left")){
            setImage(new LuffyLArrow().getImage());
            setLocation(getX()-2,getY());
        }
    }
}
