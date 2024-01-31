import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobby extends World

{
    public String test = "test";   
    
    
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
        boolean person1_clicked = false;
        String person1_character = "";
        /*while(!person1_clicked){
            if(Greenfoot.mouseClicked(cat)){
                person1_clicked = true;
                person1_character = "Kit";
            }
            else if(Greenfoot.mouseClicked(cat1)){
                person1_clicked =  true;
                person1_character = "Goku";
            }
            else if(Greenfoot.mouseClicked(cat2)){
                person1_clicked =  true;
                person1_character = "Ichi";
            }
            else if(Greenfoot.mouseClicked(cat3)){
                person1_clicked =  true;
                person1_character = "Naruto";
            }
            else if(Greenfoot.mouseClicked(cat4)){
                person1_clicked =  true;
                person1_character = "Sans";
            }
            else if(Greenfoot.mouseClicked(dog)){
                person1_clicked =  true;
                person1_character = "Luffy";
            }
        }*/
        
    }
    private void prepare(){
        Load load = new Load();
        addObject(load, 400, 175);

        
        showText("Player 1, click on the character you would like to play to select it.", 400, 325);
        showText("CLICK ANYWHERE TO DUEL", 400, 325);
        showText("B - HOW TO PLAY", 400, 375);
        showText("C - Credits", 400, 425);
    } 
    
    private void pressB(){
        boolean pressed = false;
        if(Greenfoot.isKeyDown("b")){
            showText("", 400, 325);
        }
        
    }
    private void switchc(){
        
    }
    public void blah()
    {
        // Check if a specific key is pressed (for example, the spacebar)
        if (Greenfoot.isKeyDown("space")) {
            // Display text when the spacebar is pressed
            showText("Spacebar pressed", getWidth() / 2, getHeight() / 2);
        } else {
            // Clear the text
            showText("", getWidth() / 2, getHeight() / 2);
        }
    }
        //showText("CLICK ANYWHERE TO DUEL", 400, 325);
        //showText("HOLD SPACE FOR INSTRUCTIONS", 400, 375);
        //showText("Player 1, click on the character you would like to play to select it.", 400, 325);
    }    


