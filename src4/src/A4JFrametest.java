import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class UserFrame extends JFrame
{
	public UserFrame(String str)
	{
		super(str);
		JButton[] jbt=new JButton[5];
		for (int i = 0; i < jbt.length; i++) 
			jbt[i]=new JButton(i+"버튼");
		
/*		add("North",jbt[0]);
		add("soutn",jbt[1]);
		add("center",jbt[2]);
		add("east", jbt[3]);
		add("west",jbt[4]);
*/		
/*		setLayout(new FlowLayout());
		add(jbt[0]);
		add(jbt[1]);
		add(jbt[2]);
		add(jbt[3]);
		add(jbt[4]);*/
		
		JPanel jp1=new JPanel();
		  jp1.add(jbt[0]);
		  jp1.add(jbt[1]);
		  
		  JPanel jp2=new JPanel();
		   jp2.setLayout(new BorderLayout());
		   jp2.add("North", jbt[2]);
		   jp2.add("Center", jbt[3]);
		   jp2.add("South", jbt[4]);
		   
		   add("North", jp1);
		   add("Center", jp2);
		  
		  setSize(300,300);
		  setVisible(true);
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class A4JFrametest {

	public static void main(String[] args)
	{
		  new UserFrame("환영");
	}

}
