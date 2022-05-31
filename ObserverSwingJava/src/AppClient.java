import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.*;

public class AppClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
				
		JPanel panel = new JPanel();
		frame.add(panel);		
		
		
		JLabel title1 = new JLabel("E-mail");	
		
		JTextField textField = new JTextField();
		
		
		
		JLabel title2 = new JLabel("Password");
		
		JPasswordField passwordText = new JPasswordField();
		

		JButton buttonLogin = new JButton("Login");		  
		
		
		panel.add(title1);
		panel.add(textField);
		panel.add(title2);
		panel.add(passwordText);
		panel.add(buttonLogin);
		
		//panel.setLayout(new BoxLayout(title1, BoxLayout.LINE_AXIS));
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
	
		
	   frame.pack();
	}

}
