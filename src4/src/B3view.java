import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class B3view extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField nametxt;
	private JTextField agetxt;



	public B3view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label1 = new JLabel("\uC774\uB984");
		label1.setBounds(100, 50, 57, 15);
		contentPane.add(label1);

		JLabel label2 = new JLabel("\uB098\uC774");
		label2.setBounds(100, 100, 57, 15);
		contentPane.add(label2);

		nametxt = new JTextField();
		nametxt.setBounds(140, 47, 116, 21);
		contentPane.add(nametxt);
		nametxt.setColumns(10);

		agetxt = new JTextField();
		agetxt.setBounds(140, 97, 116, 21);
		contentPane.add(agetxt);
		agetxt.setColumns(10);

		JButton btnappend = new JButton("\uCD94\uAC00");
		btnappend.addActionListener(new B3actionlistener(nametxt,agetxt));
		btnappend.setBounds(100, 150, 97, 23);
		contentPane.add(btnappend);



		JButton btnview = new JButton("\uC804\uCCB4\uBCF4\uAE30");
		btnview.addActionListener(this);//아래 재정의
			
		btnview.setBounds(220, 150, 97, 23);
		contentPane.add(btnview);



		setSize(400,350);
		setVisible(true);


	}



	@Override
	public void actionPerformed(ActionEvent e) 
	{
		new B3viewlist();
	}

}
