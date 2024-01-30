import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shuriken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shuriken extends Actor
{
    public boolean up;
    public boolean down;
    public boolean left;
    public boolean right;
    /**
     * Act - do whatever the shuriken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(up){
            setLocation(getX(), getY()+5);
        }
        else if(down){
            setLocation(getX(), getY()-5);
        }
        else if(right){
            setLocation(getX()+5, getY());
        }
        else if(left){
            setLocation(getX()-5, getY());
        }
    }
    public shuriken(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /3, image.getHeight() /3); setImage(image);
    }
    public void touchy() {
        Map world = (Map)getWorld();
        if(getY()==0){
            getWorld().removeObject(this);
            
        }
        else if(getY()==600){
            getWorld().removeObject(this);
        }
        else if(getX()==0){
            getWorld().removeObject(this);
        }
        else if(getX()==800){
            getWorld().removeObject(this);
        }
        
    }
}
