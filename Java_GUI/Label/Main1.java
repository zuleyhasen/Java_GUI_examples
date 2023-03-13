import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;



public class Main1 {
	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("indir - Kopya.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		
		JLabel label = new JLabel();
		label.setText("Bro,Do u even Code?");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER ); //set text LEFT,CENTER,RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x00FF00));  //set font color of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 50)); //set font of text
		label.setBackground(Color.white);  // set background color 
		label.setOpaque(true); //display background color
		label.setIconTextGap(-25); //set gap of text to image
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon-text within label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon-text within label
//		label.setBounds(100, 100, 250, 250);
		
		JFrame frame = new JFrame(); //creates a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
//		frame.setSize(500,500); // sets the x-dimension, and y-dimension
//		frame.setLayout(null);
		frame.setVisible(true); // make frame visible
		frame.add(label);
		frame.pack();
	}
}
