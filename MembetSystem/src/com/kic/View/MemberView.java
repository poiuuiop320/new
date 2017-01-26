package com.kic.View;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.kic.DAO.MemberDAO;

public class MemberView extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public MemberView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		MemberDAO dao=new MemberDAO();
		Vector<Vector<Comparable>> data=dao.showAll();
		System.out.println(data.size());
		Vector<String> title=new Vector<>();

		title.add("id");
		title.add("name");
		title.add("age");
		title.add("ki");
		
		
		JTable table=new JTable(data, title);
		JScrollPane pan=new JScrollPane(table);
		pan.setBounds(20,20,500,100);
		contentPane.add(pan);
		
		setBounds(10, 10, 600, 400);
		setVisible(true);
		
		
		
	}
}
