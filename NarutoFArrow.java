import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NarutoFArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NarutoFArrow extends Actor
{
    public int reload = 50;
    public boolean up = false;
    public boolean down = false;
    public boolean left = false;
    public boolean right = false;
    /**
     * Act - do whatever the NarutoFArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkW();
        checkS();
        checkD();
        checkA();
        shoot();
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("up")) {
            setImage(new NarutoBArrow().getImage());
            setLocation(getX(),getY()-2);
            up = true;
            right = false;
            left = false;
            down = false;
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("down")) {
            setImage(new NarutoFArrow().getImage());
            setLocation(getX(),getY()+2);
            down = true;
            up = false;
            right = false;
            left = false;
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("right")) {
            setImage(new NarutoRArrow().getImage());
            setLocation(getX()+2,getY());
            right = true;
            left = false;
            up = false;
            down = false;
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("left")) {
            setImage(new NarutoLArrow().getImage());
            setLocation(getX()-2,getY());
            left = true;
            right = false;
            up = false;
            down = false;
        }
    }
    public void shoot(){
        if(reload>0){
            reload--;
            
        }
        
        if(reload == 0){
            
            if(Greenfoot.isKeyDown("space")){
                if(up){
                    shuriken shuri=new shuriken();
                    getWorld().addObject(shuri, getX(), getY()-4);
                }
                else if(left){
                    shuriken shuri=new shuriken();
                    getWorld().addObject(shuri, getX()+4, getY());
                }
                else if(right){
                    shuriken shuri=new shuriken();
                    getWorld().addObject(shuri, getX()-4, getY());
                }
                else if(down){
                    shuriken shuri=new shuriken();
                    getWorld().addObject(shuri, getX(), getY()-4);
                }
                
            
            
            reload = 50;
            
            }
        }
    }
}
