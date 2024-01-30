import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shuriken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shuriken extends Actor
{
    NarutoF Nar=new NarutoF();
    /**
     * Act - do whatever the shuriken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Nar.up){ 
            setLocation(getX(), getY()+5);
            Nar.up=false;
        }
        else if(Nar.down){
            setLocation(getX(), getY()-5);
            Nar.down=false;
        }
        else if(Nar.right){
            setLocation(getX()+5, getY());
            Nar.right=false;
        }
        else if(Nar.left){
            setLocation(getX()-5, getY());
            Nar.left=false;
        }
        touchy();
    }
    
    public shuriken(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /3, image.getHeight() /3); setImage(image);
    }
    public void touchy() {
        Map world = (Map)getWorld();
        if(isAtEdge()){
            getWorld().removeObject(this);
            
        }
        
    }
}
