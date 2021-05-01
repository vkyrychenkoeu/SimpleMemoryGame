package Game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class menu extends JFrame{
		
	 public static void main(String[] args){
		 
		 JFrame okno = new JFrame("Menu");
	
         JPanel panel = new JPanel();
         panel.setLayout(null);
         okno.add(panel);
         
         JButton button1 = new JButton("Play");
      
         JButton button2 = new JButton("Score");

         JButton button3 = new JButton("Exit");
        
         	//panel.setLayout(new BorderLayout(0,1));
 	
 			
 			button1.setBounds(100, 100, 300, 30);
 			panel.add(button1);
 			

 	        button2.setBounds(100, 150, 300, 30);
 	        panel.add(button2);
 	       
 		
 	        button3.setBounds(100, 200, 300, 30);
 	        panel.add(button3);
 	       
 			
 	        
		 okno.setTitle("Gra pamięciowa");
		 okno.setPreferredSize(new Dimension(500,500));
		 okno.setLocation(500, 500);
		 okno.setBackground(Color.WHITE);
		 okno.setLocation(500, 250);
		 okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 ImageIcon img = new ImageIcon("/workspace/findacouple/src/images/one.png");
			okno.setIconImage(img.getImage());
			okno.pack();
			okno.setVisible(true);
			
      
	 }
      
}

	
	
	
	
