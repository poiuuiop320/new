package com.kic.hw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OptionTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OptionTest frame = new OptionTest();
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
	public OptionTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {//메서드 안에 인터페이스 오버라이딩, 상속, new !<E>
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "hihihihi","hi",JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(contentPane, "WARNING_MESSAGE","hi",JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(contentPane, "PLAIN_MESSAGE","hi",JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(contentPane, "ERROR_MESSAGE","hi",JOptionPane.ERROR_MESSAGE);
				JOptionPane.showInputDialog(JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(contentPane, JOptionPane.OK_CANCEL_OPTION);
				Object[] eventCache = null;
				Object anchor = 2;
				JOptionPane.showOptionDialog(contentPane, JOptionPane.DEFAULT_OPTION, "titlezzzzzzzz", getState(), getDefaultCloseOperation(), null, eventCache, anchor);
				
			}
		});
		contentPane.add(btnNewButton, BorderLayout.NORTH);
	}

}
