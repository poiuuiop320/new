import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class test extends JFrame implements ActionListener, Runnable{

	private JPanel contentPane;
	private JTextField txt;
	String name;
	int style;

	public static void main(String[] args) {

	}

	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton bt = new JButton("start");
		bt.setBounds(12, 129, 99, 94);
		contentPane.add(bt);

		txt = new JTextField("¾È³çÇÏ¼¼¿ä");
		txt.setBounds(26, 23, 79, 61);
		contentPane.add(txt);
		txt.setColumns(10);
		bt.addActionListener(this);
		name=txt.getFont().getName();
		style=txt.getFont().getStyle();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Thread th=new Thread(this);
		th.start();
		System.out.println("hello");
	}

	@Override
	public void run() 
	{
		while(true)
		{
			try {
				Thread.sleep(1000);
				if(txt.getFont().getSize()>=12&&txt.getFont().getSize()<24)
				{
					int size=txt.getFont().getSize()+2;
					txt.setFont(new Font(name,style,size));

				}
				else
				{
					txt.setFont(new Font(name,style,12));
				}
				
			} catch (InterruptedException e) {
				System.out.println(e);
			}	
		}
	}
}
