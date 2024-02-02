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
        if(!Greenfoot.mouseClicked(this)){
            BrawlChoose world = (BrawlChoose) getWorld();
            int currentPlayer = world.getPlayer();
            if(currentPlayer == 3){
                getWorld().removeObject(this);
            }
        }
        else{
            BrawlChoose world = (BrawlChoose) getWorld();
            //Map world1 = () getWorld();
            int currentPlayer = world.getPlayer();
            if(currentPlayer == 1){
                world.addObject(new NarutoF(), 100, 100);
            }
            else{
                world.addObject(new NarutoFArrow(), 700, 500);
            }
            getWorld().removeObject(this);
            world.setPlayer(currentPlayer + 1);
        }
    }
}
