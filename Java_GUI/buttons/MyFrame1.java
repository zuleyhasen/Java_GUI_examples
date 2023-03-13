import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame1 extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	
	MyFrame1(){
		
		ImageIcon icon = new ImageIcon("indir - Kopya.png");
		ImageIcon icon2 = new ImageIcon("indir - Kopya.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		
		
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
		button.setText("I'm a button!");
		button.setFocusable(false); //yazýnýn etrafýndaki borderý silmek için
		button.setIcon(icon);
//		button.setHorizontalTextPosition(JButton.CENTER);
//		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font ("Conic Sans", Font.BOLD, 12));
		button.setIconTextGap(-15);
		button.setForeground(Color.cyan);
		button.setBackground(Color.white);
		button.setBorder(BorderFactory.createEtchedBorder());
//		button.setEnabled(false);
		
		
//		button.addActionListener(e -> System.out.println("poo"));
//		actionPerformed motoduyla ayný iþi yapýyor
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== button) {
			System.out.println("poo");
//			button.setEnabled(false); bir kere basýldýktan sonra disable oluyor
			label.setVisible(true);
		}
		
	}
}
