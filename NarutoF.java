import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NarutoF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NarutoF extends Actor
{
    private int reload = 50;
    public boolean up = false;
    public boolean down = false;
    public boolean left = false;
    public boolean right = false;
    /**
     * Act - do whatever the NarutoF wants to do. This method is called whenever
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
    public NarutoF(){
      
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("W")||Greenfoot.isKeyDown("up")) {
            setImage(new NarutoB().getImage());
            setLocation(getX(),getY()-2);
            up = true;
            right = false;
            left = false;
            down = false;
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("S")||Greenfoot.isKeyDown("down")) {
            setImage(new NarutoF().getImage());
            setLocation(getX(),getY()+2);
            down = true;
            up = false;
            right = false;
            left = false;
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("D")||Greenfoot.isKeyDown("right")) {
            setImage(new NarutoR().getImage());
            setLocation(getX()+2,getY());
            right = true;
            left = false;
            up = false;
            down = false;
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("A")||Greenfoot.isKeyDown("left")) {
            setImage(new NarutoL().getImage());
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
                    getWorld().addObject(new shuriken(), getX(), getY()-10);
                }
                else if(left){
                    getWorld().addObject(new shuriken(), getX()-10, getY());
                }
                else if(right){
                    getWorld().addObject(new shuriken(), getX()+10, getY());
                }
                else{
                    getWorld().addObject(new shuriken(), getX(), getY()+10);
                }
                
            
            
            reload = 50;
            
        }
        }
    }
}
