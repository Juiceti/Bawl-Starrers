import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobby extends World

{
//<<<<<<< HEAD
    public String test = "test";
    

//=======
    
    
//>>>>>>> ab15d831526748eaa795c47eff734d27618862ec
    /**
     * Constructor for objects of class Lobby.
     * 
     */
    public Lobby()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new Text(), 400, 175);
        prepare();
        act();
    }
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new BrawlChoose());
        }
        
    }
    public void choosing(){
        CatF cat = new CatF();
        addObject(cat, 200, 495);
        GokuF cat1 = new GokuF();
        addObject(cat1, 325, 500);
        IchiF cat2 = new IchiF();
        addObject(cat2, 450, 500);
        NarutoF cat3 = new NarutoF();
        addObject(cat3, 575, 500);
        SansF cat4 = new SansF();
        addObject(cat4, 700, 500);
        LuffyF dog = new LuffyF();
        addObject(dog, 75, 500);
    }
    private void prepare(){
        Load load = new Load();
        addObject(load, 400, 175);

        
        showText("Player 1, click on the character you would like to play to select it.", 400, 325);
        showText("CLICK ANYWHERE TO DUEL", 400, 325);
        showText("HOLD SPACE FOR INSTRUCTIONS", 400, 375);
    } 
}    


