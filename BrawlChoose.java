import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrawlChoose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BrawlChoose extends World
{
    public int playerCounter = 1;
    public int health_player1=1;
    public int health_player2=1;
    //GreenfootSound sound = new GreenfootSound("Brawl Music.mp3");
    /**
     * Constructor for objects of class BrawlChoose.
     * 
     */
    public BrawlChoose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        act();
        prepareSprites();
        //sound.play();
    }
    public void act() {
        counterText();
        plsEndMySuffering();
    }
    public void prepareSprites(){
        addObject(new DisCat(), 200, 200);
        addObject(new DisGoku(), 400, 200);
        addObject(new DisIchi(), 600, 200);
        addObject(new DisLuffy(), 200, 400);
        addObject(new DisNaruto(), 400, 400);
        addObject(new DisSans(), 600, 400);
    }
    public void prepareText(){
        showText("PLAYER " + playerCounter + " CHOOSE YOUR CHARACTER", 400, 75); 
        showText("KIT", 200, 275);
        showText("GOKU", 400, 275);
        showText("ICHIGO", 600, 275);
        showText("LUFFY", 200, 475);
        showText("NARUTO", 400, 475);
        showText("SANS", 600, 475);
    }
    public void showHealth(){
        showText("Health of P1: " + health_player1, 140, 50);
        showText("Health of P2: " + health_player2, 650, 50);
    }
    public void counterText(){
        if(playerCounter >= 3){
            showText("Health of P1: " + health_player1, 140, 50);
            showText("Health of P2: " + health_player2, 650, 50);
            showText("", 400, 75); 
            showText("", 200, 275);
            showText("", 400, 275);
            showText("", 600, 275);
            showText("", 200, 475);
            showText("", 400, 475);
            showText("", 600, 475);
        }
        else{
            showText("PLAYER " + playerCounter + " CHOOSE YOUR CHARACTER", 400, 75); 
            showText("KIT", 200, 275);
            showText("GOKU", 400, 275);
            showText("ICHIGO", 600, 275);
            showText("LUFFY", 200, 475);
            showText("NARUTO", 400, 475);
            showText("SANS", 600, 475);
        }
    }
    public void plsEndMySuffering(){
        if(health_player1 == 0 || health_player2 == 0){
            //sound.pause();
            Greenfoot.setWorld(new Map());
        }
    }
    
    public int getPlayer(){
        return playerCounter;
    }
    public void setPlayer(int newPlayer){
        playerCounter = newPlayer;
    }
    public void setHealth1(int newH){
        health_player1 = newH;
    }
    public int getHealth1(){
        return health_player1;
    }
}
