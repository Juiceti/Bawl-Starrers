import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shuriken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shuriken extends Actor{


    NarutoF nar = new NarutoF();
    boolean newUp = nar.up;
    NarutoF nar1 = new NarutoF();
    boolean newDown = nar1.down;
    NarutoF nar2 = new NarutoF();
    boolean newLeft = nar2.left;
    NarutoF nar3 = new NarutoF();
    boolean newRight = nar3.right;
    private int direction;

    NarutoF Nar=new NarutoF();
    /**
     * Act - do whatever the shuriken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public shuriken() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /3, image.getHeight() /3); setImage(image);
        if(newUp){
            direction = 1;
        }
    }
    public void act(){
        if(isTouching(NarutoF.class)){
            setLocation(getX(), getY()-5); 
        }
        if(isTouching(NarutoB.class)){
            setLocation(getX(), getY()+5);
        }
        if(isTouching(NarutoL.class)){
            setLocation(getX()-5, getY());
        }
        if(isTouching(NarutoR.class)){
            setLocation(getX()+5, getY());
        }
        
        
        
        imashootmyself();
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
    public void imashootmyself(){
        
        if(isTouching(NarutoF.class)){
            while(getY()<20 || getY()>580 || getX()<20 || getX()>780){
                setLocation(getX(), getY()+5); 
            }
           
        }
                
        else if(isTouching(NarutoB.class)){
            
                while(getY()<20 || getY()>580 || getX()<20 || getX()>780){
                setLocation(getX(), getY()-5); 
            }
            
        }
        else if(isTouching(NarutoR.class)){
            while(getY()<20 || getY()>580 || getX()<20 || getX()>780){
                setLocation(getX()+5, getY()); 
            }
            }
        else if(isTouching(NarutoL.class)){
            
            while(getY()<20 || getY()>580 || getX()<20 || getX()>780){
                setLocation(getX()-5, getY()); 
            }
            
            
        }
        }
        
    }
    
        


