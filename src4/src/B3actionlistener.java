import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class B3actionlistener implements ActionListener {
	private JTextField nametxt;
	private JTextField agetxt;
	public B3actionlistener(JTextField nametxt, JTextField agetxt) {

		this.nametxt = nametxt;
		this.agetxt = agetxt;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			String name=nametxt.getText();
			int age=Integer.parseInt(agetxt.getText());
			B3service service = new B3service();
			B3vo data=new B3vo(name,age);
			service.saveFile(data);
			nametxt.setText("");
			agetxt.setText("");}
		catch(NumberFormatException e1){
			System.out.println(e1);
		}

	}
	



}
