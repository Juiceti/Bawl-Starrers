import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class luffyAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class luffyAttack extends Actor
{
    /**
     * Act - do whatever the luffyAttack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    LuffyF luf=new LuffyF();
    LuffyFArrow luf1 = new LuffyFArrow();
    int direction1;
    int bob;
    /**
     * Act - do whatever the shuriken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public luffyAttack() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
        direction1 = luf.direction1;
        direction1 = luf1.direction1;
        
    }
    
    public void act(){
        hello();
        touchy();
    }

        
    public void touchy() {
        BrawlChoose world = (BrawlChoose)getWorld();
        if(getY()<20 || getY()>580 || getX()<20 || getX()>780){
            getWorld().removeObject(this);
            
        }
        
    }
    public void hello(){
        if(direction1==0){
                
                setLocation(getX(), getY()-5); 
            
        }
        if(direction1==1){
            
                setLocation(getX(), getY()+5); 
            
        }
        if(direction1==2){
                
                setLocation(getX()+5, getY()); 
            
        }
        if(direction1==3){
                
                setLocation(getX()-5, getY()); 
            
        }
        }
    
}