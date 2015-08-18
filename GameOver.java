import greenfoot.*;
import java.awt.Color;

/**
 * This is the Game Over screen displayed when the uses loses the game. 
 * 
 * @author Achyudh, Shantanu
 * @version 14/08/2015
 */
public class GameOver extends Actor
{        
    public GameOver(int score)
    {
        GreenfootImage img = new GreenfootImage("comic.png");
                
        GreenfootImage text1 = new GreenfootImage("Press ENTER to try again!", 30, Color.WHITE, new Color(0, 0, 0, 0));
        GreenfootImage text2 = new GreenfootImage("SCORE: "+score, 60, Color.WHITE, new Color(0, 0, 0, 0));
        GreenfootImage text3 = new GreenfootImage("BEST: " + getBestScore(score), 40, Color.WHITE, new Color(0, 0, 0, 0));
        
        img.drawImage(text1, 250 - (text1.getWidth() / 2), 540);
        img.drawImage(text2, 250 - (text2.getWidth() / 2), 350);
        img.drawImage(text3, 250 - (text3.getWidth() / 2), 420);
        
        setImage(img);
    }
    
    /**
     * Returns the best score attained by the player and checks if this is a new highscore.
     * If yes, then it returns that value and sets it as the high score.
     */
    private int getBestScore(int score)
    {
        UserInfo usrObject = UserInfo.getMyInfo();
        if(usrObject != null)
        {
            int currentHigh = usrObject.getInt(1);
                       
            if(score > currentHigh)
            {
                usrObject.setInt(1, score);
                usrObject.store();
                return score;
            }
            else return currentHigh;
            
        }
        else return 0;
    }
    
    /**
     * Resets the world upon pressing Enter to start a new game.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new WorldClass());
        }
    }    
}
