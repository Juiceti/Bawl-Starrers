import greenfoot.*;  // Import Greenfoot classes

public class Text extends Actor {

    public Text() {
        // Constructor to initialize the TextDisplay actor
    }

    public void act() {
        // Check if a specific key is pressed (for example, the spacebar)
        if (Greenfoot.isKeyDown("space")) {
            // Display text when the spacebar is pressed

            getWorld().showText("", 400, 325);
            getWorld().showText("", 400, 375);
            getWorld().showText("HELLO", 400, 375);
        }
        else {
            // Clear the text
        getWorld().showText("CLICK ANYWHERE TO DUEL", 400, 325);
        getWorld().showText("HOLD SPACE FOR INSTRUCTIONS", 400, 375);
        }
    }
}
