//import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7196363953902143443L;

	public Button(String text, Label...labels) {
		
		addActionListener(			
		e ->{
				for (Label label : labels) {
					System.out.println("Ok");
				}
				
			});
			
			
			
		}
		
		
	
	
	
	 
	
	
}
