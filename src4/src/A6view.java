import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class A6view extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	public A6view(String str)
	{
		super(str);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 289);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		textField.setText("");
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("New button");
		panel.add(btn);
		
		btn.addActionListener(this);
		
		
		JLabel lblNewLabel = new JLabel("1111111111");
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		setVisible(true);
		pack();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		 System.out.println(e.getSource());
		String value=textField.getText();
		System.out.println(value);
	}
	

}
