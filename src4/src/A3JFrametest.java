import javax.swing.JButton;
import javax.swing.JFrame;

public class A3JFrametest {

	public static void main(String[] args)
	{
		JFrame jf=new JFrame("������");
		JButton jb=new JButton("Button");
		JButton jb2=new JButton("��ư2");
		jf.add(jb2);
		
		jf.add(jb);
		
		jf.setSize(300, 300);
		jf.setLocation(100, 100);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}
