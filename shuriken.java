import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shuriken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shuriken extends Actor{


    
    

    NarutoF Nar=new NarutoF();
    int direction;
    /**
     * Act - do whatever the shuriken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public shuriken() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /3, image.getHeight() /3); setImage(image);
        direction=Nar.direction;
    }
    public void act(){
        
        
        hello();
        touchy();
    }

        
    public void touchy() {
        Map world = (Map)getWorld();
        if(getY()<20 || getY()>580 || getX()<20 || getX()>780){
            getWorld().removeObject(this);
            
        }
        else if (isTouching(LuffyF.class)) {
            getWorld().removeObject(this);
        }
    }
    public void hello(){
        if(direction==0){
                
                setLocation(getX(), getY()-5); 
            
        }
        if(direction==1){
            
                setLocation(getX(), getY()+5); 
            
        }
        if(direction==2){
                
                setLocation(getX()+5, getY()); 
            
        }
        if(direction==3){
                
                setLocation(getX()-5, getY()); 
            
        }
        }
        
    }
    
        


