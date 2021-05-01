package Game;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Game{

    public static void main(String[] args){
    	
        Board b = new Board();
        b.setTitle("Gra pamięciowa");
        b.setPreferredSize(new Dimension(500,500)); 
        b.setLocation(500, 250);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("/workspace/findacouple/src/images/one.png");
		b.setIconImage(img.getImage());
        b.pack();
        b.setVisible(true);
        
       
     
    }  
 
    
}