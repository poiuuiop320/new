
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class B1ButtonAction implements ActionListener
{
	private JTextField textField;//������

	public B1ButtonAction(JTextField textField) {//�Ѱ��ذ�//�ּҿ����� ����Ű�°� call by value�� �ƴ� call by reference
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
