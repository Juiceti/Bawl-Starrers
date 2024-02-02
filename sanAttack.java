import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class luffyAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sanAttack extends Actor
{
    /**
     * Act - do whatever the luffyAttack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SansF luf=new SansF();
    LuffyFArrow luf1 = new LuffyFArrow();
    int direction;
    /**
     * Act - do whatever the shuriken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public sanAttack() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /5, image.getHeight() /5); setImage(image);
        direction = luf.direction;
        
    }
    
    public void act(){
        hello();
        touchy();
    }

        
    public void touchy() {
        BrawlChoose world = (BrawlChoose)getWorld();
        int currentHealth = world.getHealth1();
        if(getY()<20 || getY()>580 || getX()<20 || getX()>780){
            getWorld().removeObject(this);
            
        }
    }
    public void hello(){
        if(direction==0){
                
                setLocation(getX(), getY()-5); 
            
        }
        if(direction==1){
                setRotation(180);
                setLocation(getX(), getY()+5); 
            
        }
        if(direction==2){
                setRotation(90);
                setLocation(getX()+5, getY()); 
            
        }
        if(direction==3){
                setRotation(270);
                setLocation(getX()-5, getY()); 
            
        }
        }
    
}
