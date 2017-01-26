import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class B3viewlist extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public B3viewlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		table = new JTable();
		contentPane.add(table, BorderLayout.CENTER);
		B3service service=new B3service();
		Vector v=service.viewFile();
		Vector columnname=new Vector();
		columnname.add("name");
		columnname.add("age");
		table = new JTable(v,columnname);
		JScrollPane scrollpane = new JScrollPane(table);
		contentPane.add(scrollpane, BorderLayout.CENTER);
		setVisible(true);
	}
	

}
