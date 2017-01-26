package Layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Card1 extends JFrame implements MouseListener{

	Container c;
	
	
	CardLayout card=new CardLayout();
	public Card1(String str)
	{
		
		super(str);
		
		c=getContentPane();
		setLayout(new CardLayout());
		JPanel jp1=new JPanel();
		jp1.setBackground(Color.red);
		JPanel jp2=new JPanel();
		jp2.setBackground(Color.yellow);
		JPanel jp3 =new JPanel();
		jp3.setBackground(Color.blue);
		
		setLayout(card);

		c.add(jp1);
		c.add(jp2);	
		c.add(jp3);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 200);

		addMouseListener(this);
		/*(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				card.next(c);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				card.next(c);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				card.next(c);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				card.next(c);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				card.next(c);
			}
		})*/;


	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		card.next(c);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		card.next(c);
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		card.next(c);
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		card.next(c);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		card.next(c);
	}


}
