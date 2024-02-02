import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisSans here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisSans extends Actor
{
    public boolean newSans = false;
    /**
     * Act - do whatever the DisSans wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        selection();
    }
    public DisSans(){
        GreenfootImage image = getImage(); image.scale(image.getWidth() /2, image.getHeight() /2); setImage(image);
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
                world.addObject(new SansF(), 100, 100);
                world.health_player1=8;
            }
            else{
                world.addObject(new SansFArrow(), 700, 500);
                world.health_player2=8;
            }
            getWorld().removeObject(this);
            world.setPlayer(currentPlayer + 1);
        }
    }
}
