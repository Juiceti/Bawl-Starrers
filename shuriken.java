import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shuriken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shuriken extends Actor
{
    NarutoF nar = new NarutoF();
    boolean newUp = nar.up;
    NarutoF nar1 = new NarutoF();
    boolean newDown = nar1.down;
    NarutoF nar2 = new NarutoF();
    boolean newLeft = nar2.left;
    NarutoF nar3 = new NarutoF();
    boolean newRight = nar3.right;
    private int direction;
    /**
     * Act - do whatever the shuriken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public shuriken() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /3, image.getHeight() /3); setImage(image);
        if (newUp) {
            direction = 0;
        }
        else if (newDown) {
            direction = 1;
        }
        else if (newLeft) {
            direction = 2;
        }
        else if (newRight){
            direction = 3;
        }
    }
    
    public void act()
    {
        
        if(direction == 0){
           setLocation(getX(), getY()+5); 
        }
                
        else if(direction == 1){
            
                setLocation(getX(), getY()-5);
            
        }
        else if(direction == 3){
            
                setLocation(getX()+5, getY());
            }
        else {
            
            setLocation(getX()-5, getY());
            
            
        }
    }
        
    public void touchy() {
        Map world = (Map)getWorld();
        if(getY()==0 || getY()==600 || getX()==0 || getX()==800){
            getWorld().removeObject(this);
            
        }
        else if (isTouching(LuffyF.class)) {
            getWorld().removeObject(this);
        }
    }
}
