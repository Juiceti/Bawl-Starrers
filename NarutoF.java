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
        if (Greenfoot.isKeyDown("W")||Greenfoot.isKeyDown("up")) {
            GreenfootImage image = new GreenfootImage("NarutoB.png");
            // image.scale();
            setImage(image);
        if (Greenfoot.isKeyDown("W")) {
            setImage(new NarutoB().getImage());
            setLocation(getX(),getY()-2);
            up = true;
            right = false;
            left = false;
            down = false;
        }
    }
    }   
    public void checkS() {
        if (Greenfoot.isKeyDown("S")||Greenfoot.isKeyDown("down")) {
            GreenfootImage image = new GreenfootImage("NarutoF.png");
            // image.scale();
            setImage(image);
        if (Greenfoot.isKeyDown("S")) {
            setImage(new NarutoF().getImage());
            setLocation(getX(),getY()+2);
            down = true;
            up = false;
            right = false;
            left = false;
        }
    }
    }       
    public void checkD() {

        if (Greenfoot.isKeyDown("D")||Greenfoot.isKeyDown("right")) {
            GreenfootImage image = new GreenfootImage("NarutoR.png");
            // image.scale();
            setImage(image);

        if (Greenfoot.isKeyDown("D")) {
            setImage(new NarutoR().getImage());
            setLocation(getX()+2,getY());
            right = true;
            left = false;
            up = false;
            down = false;
        }
    }
    }
    public void checkA() {
        if (Greenfoot.isKeyDown("A")||Greenfoot.isKeyDown("left")) {
            GreenfootImage image = new GreenfootImage("NarutoL.png");
            // image.scale();
            setImage(image);
        if (Greenfoot.isKeyDown("A")) {
            setImage(new NarutoL().getImage());
            setLocation(getX()-2,getY());
            left = true;
            right = false;
            up = false;
            down = false;
        }
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
}
