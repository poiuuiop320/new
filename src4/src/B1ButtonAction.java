
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class B1ButtonAction implements ActionListener
{
	private JTextField textField;//받은값

	public B1ButtonAction(JTextField textField) {//넘겨준값//주소에대한 가르키는거 call by value가 아닌 call by reference
		// TODO Auto-generated constructor stub
		this.textField=textField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("hello");
		String name=textField.getText();
		System.out.println(name);
		textField.setText("");
		
	}
  
	

}
