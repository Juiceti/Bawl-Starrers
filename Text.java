import greenfoot.*;  // Import Greenfoot classes

public class Text extends Actor {

    public Text() {
        // Constructor to initialize the TextDisplay actor
    }

    public void act() {
        // Check if a specific key is pressed (for example, the spacebar)
        if (Greenfoot.isKeyDown("space")) {
            // Display text when the spacebar is pressed
            setImage(new GreenfootImage("Spacebar pressed", 24, Color.WHITE, Color.BLACK));
        } else {
            // Clear the text
            setImage(new GreenfootImage("")); // Clears the image
        }
    }
}
