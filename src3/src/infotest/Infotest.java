package infotest;

import java.awt.TextArea;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

public class Infotest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;





	public Infotest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label1 = new JLabel("\uC774\uB984");
		label1.setBounds(12, 10, 57, 15);
		contentPane.add(label1);

		JLabel label2 = new JLabel("\uC8FC\uC18C");
		label2.setBounds(12, 52, 57, 15);
		contentPane.add(label2);

		JLabel label3 = new JLabel("\uC88B\uC544\uD558\uB294 \uACFC\uC77C");
		label3.setBounds(12, 84, 97, 29);
		contentPane.add(label3);

		JLabel label4 = new JLabel("\uC131\uBCC4");
		label4.setBounds(12, 126, 57, 26);
		contentPane.add(label4);

		JLabel label5 = new JLabel("\uD608\uC561\uD615");
		label5.setBounds(12, 162, 57, 15);
		contentPane.add(label5);

		textField = new JTextField();
		textField.setBounds(100, 7, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);



		Vector<String> com=new Vector<>();
		com.add("서울");
		com.add("경기");
		com.add("강원");
		com.add("부산");
		JComboBox<Object> comboBox = new JComboBox(com);
		comboBox.setBounds(102, 49, 83, 21);
		contentPane.add(comboBox);

		
		
		JCheckBox[] ck=new JCheckBox[4];
		ck[0] = new JCheckBox("\uB538\uAE30");
		ck[0].setBounds(12, 99, 57, 23);
		contentPane.add(ck[0]);
		
		ck[1] = new JCheckBox("\uC0AC\uACFC");
		ck[1].setBounds(101, 99, 57, 23);
		contentPane.add(ck[1]);
		
		ck[2] = new JCheckBox("\uD3EC\uB3C4");
		ck[2].setBounds(183, 99, 57, 23);
		contentPane.add(ck[2]);
		
		ck[3] = new JCheckBox("\uD0A4\uC704");
		ck[3].setBounds(273, 99, 57, 23);
		contentPane.add(ck[3]);

		JRadioButton radio1 = new JRadioButton("\uB0A8\uC790");
		radio1.setBounds(97, 136, 121, 23);
		
		JRadioButton radio2 = new JRadioButton("\uC5EC\uC790");
		radio2.setBounds(249, 136, 121, 23);
       ButtonGroup group=new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
		contentPane.add(radio1);
		contentPane.add(radio2);
		
		String[] arr={"A","B","AB","O"};
		JList list = new JList(arr);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(94, 161, 105, 108);
		contentPane.add(list);
		TextArea textArea = new TextArea();
		textArea.setBounds(115, 298, 359, 154);
		contentPane.add(textArea);
		
		
	
		JButton btnClick = new JButton("click");
		btnClick.addActionListener(new Pro(textField,comboBox,ck,list,group));		
		btnClick.addActionListener(new Protest(textField,comboBox,ck,list,group));
		btnClick.setBounds(12, 429, 97, 23);
		contentPane.add(btnClick);
		
	
		
		
		

		setSize(500, 500);
		setVisible(true);
		

	}
}
