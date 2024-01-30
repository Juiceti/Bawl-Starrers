import greenfoot.*;  // Import Greenfoot classes

public class Text extends Actor {

    public Text() {
        // Constructor to initialize the TextDisplay actor
    }

    public void act() {
        // Check if a specific key is pressed (for example, the spacebar)
        if (Greenfoot.isKeyDown("space")) {
            // Display text when the spacebar is pressed
            getWorld().showText("spacebar pressed", 400, 300);
        } else {
            // Clear the text
            getWorld().showText("", 400, 300); // Clears the image
        }
    }
}