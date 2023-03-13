import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class MyFrame5 extends JFrame implements ActionListener{
	
	JComboBox comboBox;

	MyFrame5(){
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"dog","cat","bird"};
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		
//		comboBox.setEditable(true);
//		System.out.println(comboBox.getItemCount());
//		comboBox.addItem("horse");
//		comboBox.insertItemAt("cow", 0);
//		comboBox.setSelectedIndex(1);
//		comboBox.removeItem("cat");
//		comboBox.removeItemAt(0);
//		comboBox.removeAll();

		this.add(comboBox);
		this.pack();
		this.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {


		if(e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
			
		}
		
	}

}
