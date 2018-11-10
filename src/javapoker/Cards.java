package src.javapoker;

import java.awt.image.BufferedImage;

/**
 *
 * @author rithv
 */

public class Cards {
    private BufferedImage cardImage;
    private int vals;
        
     public Cards(int Value, BufferedImage card) {
      
        cardImage = card;
        vals= Value;
       
    }
     public BufferedImage getCardImage(){
        return cardImage;
    }
      public int getScore(){
        return vals;
    }
   
   
}

