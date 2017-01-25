package Layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.LayoutManager;

public class Layout_1 extends JFrame {


	public Layout_1() {
		setLayout(new GridLayout(2,3,10,20));
		JButton[] jbtn=new JButton[6];
		for (int i = 0; i < jbtn.length; i++) {
			jbtn[i]=new JButton("¹öÆ°"+i);
			
		}
		for (int i = 0; i < jbtn.length; i++) {
			add(jbtn[i]);
		}
		/*setSize(300,300);
		setLocation(200, 200);*/
		setBounds(200,200,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		


	}
	/*private JPanel contentPane;

	 *//**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layout_1 frame = new Layout_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	  *//**
	  * Create the frame.
	  *//*
	public Layout_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
	}*/

}
