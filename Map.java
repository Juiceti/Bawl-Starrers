import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map extends World
{
    
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
    }
    public void act(){
        
    }
    public void prepare(){
        //SansF san = new SansF();
        //addObject(san, 400, 550);
        //Piper pip = new Piper();
        //addObject(pip, 200, 50);
        //LuffyF dog = new LuffyF();
        //addObject(dog, 400, 300);
    }
    public void add(){
        DisCat dis=new DisCat();
        if(dis.newCat==true){
            addObject(new CatF(), 100,100);
            dis.newCat=false;
        }
    }
}
