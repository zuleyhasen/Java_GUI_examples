import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame6 extends JFrame implements ActionListener {
	
	JButton button;
	JCheckBox checkBox;
	ImageIcon xIcon;
	ImageIcon trueIcon;
	
	MyFrame6(){
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		xIcon = new ImageIcon("false (1).png");
		trueIcon = new ImageIcon("true (1).png");
		
		checkBox = new JCheckBox(); 
		checkBox.setText("I am not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN,35));
		checkBox.setIcon(xIcon);
		checkBox.setSelectedIcon(trueIcon);
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		 
		if(e.getSource() == button) {
			System.out.println(checkBox.isSelected());
		}
		
	}

}
