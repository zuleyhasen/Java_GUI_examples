import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main6 {
	
	public static void main(String[] args) {
		
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title",JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title",JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title",JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title",JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title",JOptionPane.ERROR_MESSAGE);
//		
//		JOptionPane.showConfirmDialog(null, "bro,do you even code?","my title",JOptionPane.YES_NO_CANCEL_OPTION);
		
//		System.out.println(JOptionPane.showConfirmDialog(null, "bro,do you even code?","my title",JOptionPane.YES_NO_CANCEL_OPTION));
//		yes=0, no=1, cancel=2, close=-1
	
//		int answer = JOptionPane.showConfirmDialog(null, "bro,do you even code?","my title",JOptionPane.YES_NO_CANCEL_OPTION);
		
//		String name = JOptionPane.showInputDialog("What's your name?");
//		System.out.println("Hello " + name );
		
		String[] responses = {"No! You're awsome","Yea, I know","*blush*"};
		ImageIcon icon = new ImageIcon("indir - Kopya.png");
		JOptionPane.showOptionDialog(
				null,
				"Your're awsome",
				"secret message",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				icon,
				responses,
				1);
		
		
		
		
	}

}
