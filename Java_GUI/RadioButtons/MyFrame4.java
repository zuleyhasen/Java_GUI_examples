import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame4 extends JFrame implements ActionListener{
	
	JRadioButton pizza;
	JRadioButton hotDog;
	JRadioButton burger;
	ImageIcon pizzaIcon;
	ImageIcon hotDogIcon;
	ImageIcon burgerIcon;
	
	
	MyFrame4(){
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("pizza.png");
		hotDogIcon = new ImageIcon("hotDog (1).png");
		burgerIcon = new ImageIcon("burger (1).png");
		
		pizza = new JRadioButton("pizza");
		burger = new JRadioButton("burger");
		hotDog = new JRadioButton("hotdog");
		
		pizza.addActionListener(this);
		burger.addActionListener(this);
		hotDog.addActionListener(this);
		
		pizza.setIcon(pizzaIcon);
		burger.setIcon(burgerIcon);
		hotDog.setIcon(hotDogIcon);
		
		ButtonGroup group = new ButtonGroup();
		group.add(burger);
		group.add(hotDog);
		group.add(pizza);
		
		this.add(burger);
		this.add(pizza);
		this.add(hotDog);
		this.pack();
		this.setVisible(true);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== burger ) {
			System.out.println("You ordered a burger");
		}
		else if(e.getSource()== hotDog) {
			System.out.println("You ordered a hotDog");
		}else if (e.getSource()== pizza) {
			System.out.println("You ordered a pizza");
		}
		
	}

}
