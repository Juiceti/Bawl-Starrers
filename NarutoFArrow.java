import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NarutoF here.
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
        healthminus();
    }
    public void healthminus(){
        if (isTouching(luffyAttack.class)){
            removeTouching(luffyAttack.class);
            BrawlChoose world = (BrawlChoose) getWorld();
            world.health_player2--;
        }
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("up")) {
            GreenfootImage image = new GreenfootImage("NarutoB.png");
            setImage(image);
            setLocation(getX(), getY()-2);
        
        direction = 0;
    }
    }   
    public void checkS() {
        if (Greenfoot.isKeyDown("down")) {
            GreenfootImage image = new GreenfootImage("NarutoF.png");
            // image.scale();
            setImage(image);
            setLocation(getX(), getY()+2);
            direction = 1;
            
    }
    }       
    public void checkD() {

        if (Greenfoot.isKeyDown("right")) {
            GreenfootImage image = new GreenfootImage("NarutoR.png");
            // image.scale();
            setImage(image);
            setLocation(getX()+2, getY());
            direction = 2;
    }
    }
    public void checkA() {
        if (Greenfoot.isKeyDown("left")) {
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
            
            if(Greenfoot.isKeyDown("enter")){
                shuriken Shuriken = new shuriken();
                getWorld().addObject(Shuriken, getX(), getY()-3);
                reload = 50;
            
            }
            
        }
    }
    public int getDirection(){
        return direction;
    }
}
