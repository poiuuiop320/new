package com.kic.hw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;

public class ViewAction implements ActionListener {

	private JTextField txt;	
	private JList listleft;	
	private JList listright;

	public ViewAction(JTextField txt, JList listleft, JList listright) 
	{

		this.txt = txt;
		this.listleft = listleft;
		this.listright = listright;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(e);
		JButton btn=(JButton)e.getSource();
		if(btn.getText().equals("추가"))
		{
			DefaultListModel model=(DefaultListModel)listleft.getModel();
			model.addElement(txt.getText());
			txt.setText("");

		}
		else if(btn.getText().equals("->"))
		{
			int a=listleft.getSelectedIndex();
			DefaultListModel m=(DefaultListModel)listleft.getModel();
			Object o=m.remove(a);
			DefaultListModel m2=(DefaultListModel)listright.getModel();
			m2.addElement(o);
			System.out.println(m);
		}
		else if(btn.getText().equals("<-"))
		{
			int b=listleft.getSelectedIndex();
			DefaultListModel m3=(DefaultListModel)listright.getModel();
			Object o=m3.remove(b);
			DefaultListModel m4=(DefaultListModel)listleft.getModel();
			m4.addElement(o);
			System.out.println(m3);
		}
	}

}


/*
파일 열기 저장 끝 
서식 글꼴 스타일 크기
버튼 가운데정렬 왼쪽정렬 오른쪽정렬

*/
