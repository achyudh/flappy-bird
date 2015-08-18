import greenfoot.*;  

/**
 * This is an invisible line between two pipes. When the bee touches it, it knows to tell the world to add a point.
 * 
 * @author Achyudh, Shantanu
 * @version 14/08/2015
 */
public class Boundary extends Actor
{
    private GreenfootImage imgBoundary;
    private boolean isPipeInitialized = false; //Checks if pipe has been initialized in the world
    private int pos;
    public Boundary(int location)
    {
        imgBoundary = new GreenfootImage(1, 180); //The image for the line. This stays transparent.     
        pos = location;
        setImage(imgBoundary);
    }
 
    public void act() 
    {
        if(!isPipeInitialized)
        {
            setLocation(500, pos);
            isPipeInitialized = true;
        }
        
        move(-5);
    }    
}
