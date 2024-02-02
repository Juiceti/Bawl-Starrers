import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NarutoF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LuffyF extends Actor
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
    public LuffyF(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
    public void healthminus(){
        if (isTouching(shuriken.class)){
            removeTouching(shuriken.class);
            BrawlChoose world = (BrawlChoose) getWorld();
            world.health_player1--;
        }
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("w")) {
            GreenfootImage image = new GreenfootImage("Luffy_behind.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
            setImage(image);
            setLocation(getX(), getY()-2);
        
        direction = 0;
    }
    }   
    public void checkS() {
        if (Greenfoot.isKeyDown("s")) {
            GreenfootImage image = new GreenfootImage("Luffy_front.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
            // image.scale();
            setImage(image);
            setLocation(getX(), getY()+2);
            direction = 1;
            
    }
    }       
    public void checkD() {

        if (Greenfoot.isKeyDown("d")) {
            GreenfootImage image = new GreenfootImage("Luffy_right.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
            // image.scale();
            setImage(image);
            setLocation(getX()+2, getY());
            direction = 2;
    }
    }
    public void checkA() {
        if (Greenfoot.isKeyDown("a")) {
            GreenfootImage image = new GreenfootImage("Luffy_left.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
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
                luffyAttack Shuriken = new luffyAttack();
                getWorld().addObject(Shuriken, getX(), getY()-3);
                reload = 50;
            
            }
            
        }
    }
    public int getDirection(){
        return direction;
    }
}
