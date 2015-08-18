import greenfoot.*;  

/**
 * The top part of the "pipe"
 * 
 * @author Achyudh, Shantanu
 * @version 14/08/2015
 */
public class TopPipe extends Actor
{
    private GreenfootImage imgTop;
    
    private boolean isInitialized = false; //Checks if the pipe has been initialized on the screen.
    
    private int pos; //The midpoint of the gap in the pipes
  
    public TopPipe(int location)
    {
        imgTop = new GreenfootImage(80, location - 50); 
        pos = location;
    }
    
    /**
     * Checks if the pipe has been initialized. If not, then sets the pipe's location.
     * Moves the pipe to the left across the screen and remove it just when it exits the world. 
     */
    public void act() 
    {
        if(!isInitialized)  
        {
            setLocation(500, pos - 100 - (imgTop.getHeight() / 2));
            isInitialized = true;
        }
        
        if(getX() <= 1) 
        {
            getWorld().removeObject(this);
        }
        
        move(-5);
    }
}
