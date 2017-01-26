package com.kic.hw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class view extends JFrame {

	private JPanel contentPane;
	private JTextField txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view frame = new view();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JList listright = new JList(new DefaultListModel<>());
		listright.setBounds(250, 77, 116, 137);
		contentPane.add(listright);

		JList listleft = new JList(new DefaultListModel<>());
		listleft.setBounds(54, 77, 116, 137);
		contentPane.add(listleft);

		txt = new JTextField();
		txt.setBounds(54, 10, 116, 21);
		contentPane.add(txt);
		txt.setColumns(10);



		JButton append = new JButton("\uCD94\uAC00");
		append.setBounds(182, 9, 97, 23);
		contentPane.add(append);
		append.addActionListener(new ViewAction(txt,listleft,listright));				
		JButton btnright = new JButton("->");
		btnright.setBounds(182, 100, 56, 21);
		contentPane.add(btnright);
		btnright.addActionListener(new ViewAction(txt,listleft,listright));
		JButton btnleft = new JButton("<-");
		btnleft.setBounds(182, 160, 56, 21);
		contentPane.add(btnleft);
		btnleft.addActionListener(new ViewAction(txt,listleft,listright));
	}

}
