import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map extends World
{
    public int playerCounter = 0;
    public int health_player1;
    public int health_player2;
    public String player1 = "";
    public String player2 = "";

    /**
     * Constructor for objects of class Map.
     * 
     */
    public Map()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
        add();
        showHealth();
        showPlayer();
        act();
        checkCat();
        
    }
    public void act(){
        
    }
    public void prepare(){
        //SansF san = new SansF();
        //addObject(new NarutoF(), 400, 100);
        //addObject(san, 400, 550);
        //Piper pip = new Piper();
        //addObject(pip, 200, 50);
        //LuffyF dog = new LuffyF();
        //addObject(dog, 400, 300);
    }
    public void add(){
        /*DisCat dis=new DisCat();
        if(dis.newCat==true){
            if(playerCounter == 0){
                addObject(new CatF(), 100,100);
                playerCounter++;
                dis.newCat=false;
            }
            else{
                addObject(new CatFArrow(), 100, 500);
                dis.newCat=false;
            }
        }*/
    }
    public void showPlayer(){
        showText(player1 + ": ", 60, 50);
        showText(player2 + ": " + player2, 352, 50);
    }
    public void setHealth(){
        
    }
    public void showHealth(){
        showText("Health of P1: " + health_player1, 140, 100);
        showText("Health of P2: " + health_player2, 650, 100);
    }
    public int getPlayer(){
        return playerCounter;
    }
    public void checkCat(){
        DisCat actor = new DisCat();
        boolean heyNowBrownCow = actor.getCat();
        if(heyNowBrownCow){
            addObject(new CatF(), 400, 100);
        }
    }
}
