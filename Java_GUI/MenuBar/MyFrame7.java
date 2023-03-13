import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame7 extends JFrame implements ActionListener{
	
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	ImageIcon saveImage;
	ImageIcon exitImage;
	ImageIcon loadImage;
	
	MyFrame7(){
		
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500, 500);
	this.setLayout(new FlowLayout());
	
	menuBar = new JMenuBar();
	
	fileMenu = new JMenu("File");
	editMenu = new JMenu("Edit");
	helpMenu = new JMenu("Help");
	
	loadItem = new JMenuItem("Load");
	saveItem = new JMenuItem("Save");
	exitItem = new JMenuItem("Exit");
	
	loadItem.addActionListener(this);
	saveItem.addActionListener(this);
	exitItem.addActionListener(this);
	
	
	loadItem.setMnemonic(KeyEvent.VK_L); //press l for load
	saveItem.setMnemonic(KeyEvent.VK_S); //press s for save
	exitItem.setMnemonic(KeyEvent.VK_E); //press e for exit
	
	fileMenu.add(loadItem);
	fileMenu.add(saveItem);
	fileMenu.add(exitItem);
	
	menuBar.add(fileMenu);
	menuBar.add(editMenu);
	menuBar.add(helpMenu);

	saveImage = new ImageIcon("save.png");
	loadImage = new ImageIcon("setup.png");
	exitImage = new ImageIcon("exit.png");
	
	loadItem.setIcon(loadImage);
	saveItem.setIcon(saveImage);
	exitItem.setIcon(exitImage);
	
	this.setJMenuBar(menuBar);
	this.setVisible(true);


	
	
	
   }
	
	


	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == loadItem) {
			System.out.println("you loaded a file");
		}else if(e.getSource() == saveItem) {
			System.out.println("You saved the file");	
		}else if(e.getSource() == exitItem) {
			System.exit(0);
		}

		
	}

}
