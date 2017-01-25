package infotest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pro extends JFrame implements ActionListener{
	   private JTextField txtname;
	   private JComboBox<Object> combo;
	   private JCheckBox[] ck;
	   private JList<Object> list;
	   private ButtonGroup g;
	   public Pro(JTextField txtname, JComboBox<Object> combo ,JCheckBox[] ck,JList<Object> list,ButtonGroup g )
		  {
			  this.txtname=txtname;
			  this.combo=combo;
			  this.ck=ck;
			  this.list=list;
			  this.g=g;
		  }


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			    JTextArea arr=new JTextArea();
			    arr.append(txtname.getText()+"\n");
			    arr.append(combo.getSelectedItem().toString()+"\n");
			    Enumeration enu=g.getElements();
			    while(enu.hasMoreElements())//enumeration hasmore얼마나 많은지
			    {
			       Object o=	enu.nextElement();//다음 객체를 반환
			       if(o instanceof JRadioButton)
			       {
			    	   JRadioButton rad=(JRadioButton)o;
			    	   if(rad.isSelected())
			    		   arr.append(rad.getText()+"\n");
			       }
			    }
			    
			    
			    String r="";
			    for(int i=0; i<ck.length; i++)
			    {
			    	 if(ck[i].isSelected())
			    		 r+=ck[i].getText()+"  ";
			    	
			    }
			    arr.append(r+"\n");
			    arr.append(list.getSelectedValue()+"\n");
			   
			    add(arr);
			    setVisible(true);   
			    setSize(400,400);
			    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}


}
