import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisNaruto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisNaruto extends Actor
{
    public boolean newNaruto = false;
    /**
     * Act - do whatever the DisNaruto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        selection();
    }
    public DisNaruto(){
      
    }
    public void selection(){
        if(Greenfoot.mouseClicked(this)){
            BrawlChoose world = (BrawlChoose) getWorld();
            int currentPlayer = world.getPlayer();
            world.setPlayer(currentPlayer + 1);
            newNaruto = true;
            //Greenfoot.setWorld(new Lobby());
            //getWorld().addObject(new LuffyF(),100,100);
        }
    }
<<<<<<< HEAD
    
=======
>>>>>>> c726eb41bb0a46e0b7eb20b2e1626c3179682c89
}
