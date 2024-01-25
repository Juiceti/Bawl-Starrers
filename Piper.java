import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Piper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piper extends Actor
{
    private int reload = 50;
    /**
     * Act - do whatever the Piper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkMove();
        spawnBullet();
    }    
    public Piper(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /28, image.getHeight() /28); setImage(image);
    }
    public void checkMove(){
        if (Greenfoot.isKeyDown("d")) 
        {
            setLocation(getX() +2, getY());
        }
        if (Greenfoot.isKeyDown("a")) 
        {
            setLocation(getX() -2, getY());
        }
        if (Greenfoot.isKeyDown("w")) 
        {
            setLocation(getX() , getY() - 2);
        }
        if (Greenfoot.isKeyDown("s")) 
        {
            setLocation(getX(), getY()  + 2);
        }
    }
    public void spawnBullet(){
        if(reload > 0){
            reload--;
        }
        if(reload == 0){
            if(Greenfoot.isKeyDown("enter")){
            Pbullet pew = new Pbullet();
            getWorld().addObject(pew, getX()-25, getY() -10);
            reload = 50;
            }
        }
    }
}
