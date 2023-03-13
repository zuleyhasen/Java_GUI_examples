import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame10 extends JFrame implements KeyListener {
	
	JLabel label;
	ImageIcon rocket;
	
	MyFrame10(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.addKeyListener(this);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
//		label.setBackground(Color.BLACK);
//		label.setOpaque(true);
		
		rocket = new ImageIcon("rocket.png");
		label.setIcon(rocket);
		this.add(label);


		this.getContentPane().setBackground(Color.BLACK);
		this.setSize(500,500);
		this.setVisible(true);
		
	}

	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
			case 'a': label.setLocation(label.getX()-5,label.getY());
				break;
			case 'd': label.setLocation(label.getX()+5,label.getY());
				break;
			case 'w' : label.setLocation(label.getX(),label.getY()-5);
				break;
			case 's': label.setLocation(label.getX(),label.getY()+5);
				break;
		} 
	}




	@Override
	public void keyPressed(KeyEvent e) {
//		 TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case 37: label.setLocation(label.getX()-5,label.getY());
			break;
		case 39: label.setLocation(label.getX()+5,label.getY());
			break;
		case 38 : label.setLocation(label.getX(),label.getY()-5);
			break;
		case 40: label.setLocation(label.getX(),label.getY()+5);
			break;
		} 
	}




	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
		System.out.println(e.getKeyChar());
	}
}
