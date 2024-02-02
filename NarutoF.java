import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NarutoF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NarutoF extends Actor
{
    public int reload = 50;
    public boolean up = false;
    public boolean down = false;
    public boolean left = false;
    public boolean right = false;
    public static int direction;
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
    public void checkW() {
        if (Greenfoot.isKeyDown("W")) {
            GreenfootImage image = new GreenfootImage("NarutoB.png");
            setImage(image);
            setLocation(getX(), getY()-2);
        
        direction = 0;
    }
    }   
    public void checkS() {
        if (Greenfoot.isKeyDown("S")) {
            GreenfootImage image = new GreenfootImage("NarutoF.png");
            // image.scale();
            setImage(image);
            setLocation(getX(), getY()+2);
            direction = 1;
            
    }
    }       
    public void checkD() {

        if (Greenfoot.isKeyDown("D")) {
            GreenfootImage image = new GreenfootImage("NarutoR.png");
            // image.scale();
            setImage(image);
            setLocation(getX()+2, getY());
            direction = 2;
    }
    }
    public void checkA() {
        if (Greenfoot.isKeyDown("A")) {
            GreenfootImage image = new GreenfootImage("NarutoL.png");
            // image.scale();
            setImage(image);
            setLocation(getX()-2, getY());
            direction = 3;
    }
    }
    public void shoot(){
        if(reload>0){
            reload--;
            
        }
        
        if(reload == 0){
            
            if(Greenfoot.isKeyDown("space")){
                shuriken Shuriken = new shuriken();
                
                if(up){
                    getWorld().addObject(Shuriken, getX(), getY());
                }
                else if(left){
                    getWorld().addObject(Shuriken, getX(), getY());
                }
                else if(right){
                    getWorld().addObject(Shuriken, getX(), getY());
                }
                else{
                    getWorld().addObject(Shuriken, getX(), getY());
                }
                reload = 50;
            
            }
            
        }
    }
    public int getDirection(){
        return direction;
    }
}
