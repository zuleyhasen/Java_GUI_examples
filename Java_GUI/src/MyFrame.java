import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	

	MyFrame(){

		this.setSize(420,420); // sets the x-dimension, and y-dimension
		this.setResizable(false);// prevent this from being resized
		this.setVisible(true); // make this visible
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Züley's digital clock");
		
		
	    ImageIcon image =new ImageIcon("Z.png");
	    this.setIconImage(image.getImage());
//	    this.getContentPane().setBackground(Color.magenta);
	    this.getContentPane().setBackground(new Color(53,20,102));
	}
	
	
}
   