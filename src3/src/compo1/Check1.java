package compo1;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Check1 extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Check1(String str) {
		 super(str);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("좋아하는 과일을 선택");
		lblNewLabel.setBounds(12, 10, 303, 20);
		contentPane.add(lblNewLabel);
		
		JCheckBox[] ch=new JCheckBox[4];
		ch[0]=new JCheckBox("사과");
		
		
		ch[0].setBounds(8, 36, 115, 23);
		contentPane.add(ch[0]);
		
		ch[1] = new JCheckBox("딸기");
		ch[1].setBounds(195, 36, 115, 23);
		contentPane.add(ch[1]);
		
		ch[2] = new JCheckBox("키위",true);
		ch[2].setBounds(8, 84, 115, 23);
		contentPane.add(ch[2]);
		
		ch[3]= new JCheckBox("포도");
		ch[3].setBounds(195, 94, 115, 23);
		contentPane.add(ch[3]);
		
		JButton btnok = new JButton("ok");
		btnok.setBounds(180, 176, 97, 23);
		contentPane.add(btnok);
		
		JButton btncancel = new JButton("cancel");
		btncancel.setBounds(301, 176, 97, 23);
		contentPane.add(btncancel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(32, 147, 97, 88);
		contentPane.add(textArea);
		btnok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for(int i=0; i<ch.length; i++)
				{
					if(ch[i].isSelected())
					{
						textArea.append(ch[i].getText()+"\n");
					}
					
					
				}
				
				
				
			}
		});
		
		

		setVisible(true);
	}
}
