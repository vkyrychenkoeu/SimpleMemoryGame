package Game;

import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Card extends JButton{
    private int id;
    private boolean matched = false;


    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }


    public void setMatched(boolean matched){
        this.matched = matched;
    }

    public boolean getMatched(){
        return this.matched;
    }
    
    ImageIcon CardBack = new ImageIcon("/workspace/findacouple/src/images/logoPJATK.png");

	ImageIcon[] Card;



	
}