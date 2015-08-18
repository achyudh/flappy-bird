import greenfoot.*;  
import java.awt.Color;

/**
 * A text display showing an integer.
 * 
 * @author Achyudh, Shantanu
 * @version 14/08/2015
 */
public class ScoreDisplay extends Actor
{
    public int integerScore; 
    
    /**
     * This function creates a display with the value set to zero.
     */
    public ScoreDisplay()
    {
        setToValue(0);
        updateScore();
    }

    /**
     * Sets the score to be displayed on the screen to eaqual ine integer passed.
     */
    private void setToValue(int num)
    {
        integerScore = num;
        updateScore();
    }

    /**
     * Add the integer parameter to the score display.
     */
    public void add(int num)
    {
        integerScore += num;
        updateScore();
    }

    /**
     * Update the screen to display the score.
     */
    private void updateScore()
    {
        //Create an image with the current score
        GreenfootImage text = new GreenfootImage(""+integerScore, 60, Color.WHITE, new Color(0, 0, 0, 0));
        
        setImage(text);
    }
}
