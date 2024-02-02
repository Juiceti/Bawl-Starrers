import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LuffyF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LuffyFArrow extends Actor
{   
    public static int direction1;
    public int reload1;
    /**
     * Act - do whatever the LuffyF wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkS();
        checkW();
        checkD();
        checkA();
        shoot();
    }
    public LuffyFArrow(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
    }
    public void checkW() {
        if (Greenfoot.isKeyDown("up")) {
            GreenfootImage image = new GreenfootImage("Luffy_behind.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX(),getY()-2);
        }
    }

    public void checkS() {
        if (Greenfoot.isKeyDown("down")) {
            GreenfootImage image = new GreenfootImage("Luffy_front.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX(),getY()+2);
        }
    }

    public void checkD() {
        if (Greenfoot.isKeyDown("right")) {
            GreenfootImage image = new GreenfootImage("Luffy_right.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX()+2,getY());
        }
    }

    public void checkA() {
        if (Greenfoot.isKeyDown("left")) {
            GreenfootImage image = new GreenfootImage("Luffy_left.png");
            image.scale(image.getWidth() /2, image.getHeight() /2); 
            setImage(image);
            setLocation(getX()-2,getY());
        }
    }
    public void shoot(){
        if(reload1>0){
            reload1--;
            
        }
        
        if(reload1 == 0){
            
            if(Greenfoot.isKeyDown("space")){
                luffyAttack lAttack = new luffyAttack();
                
                if(direction1==0){
                    getWorld().addObject(lAttack, getX(), getY()-3);
                }
                else if(direction1==1){
                    getWorld().addObject(lAttack, getX(), getY()+3);
                }
                else if(direction1==2){
                    getWorld().addObject(lAttack, getX()+3, getY());
                }
                else if(direction1==3){
                    getWorld().addObject(lAttack, getX()-3, getY());
                }
                reload1 = 50;
            
            }
            
        }
    }
}
