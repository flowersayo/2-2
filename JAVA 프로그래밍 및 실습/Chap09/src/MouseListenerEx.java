	import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

	public class MouseListenerEx extends JFrame {

		JLabel la=new JLabel("Hello");
		
		public MouseListenerEx () {
			setTitle("���콺 �̺�Ʈ ����");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container c=getContentPane();
			c.setLayout(null);
			la.setSize(50,20);
			//setLocale�ƴ�! 
			la.setLocation(30,30);
			c.add(la);
			
			//label�� �ƴ� contentpane�� �̺�Ʈ ������ ����.
			c.addMouseListener(new MyMouseListener());
			//Frame ũ�� ����
			setSize(200,200);
			setVisible(true);
			
			
		}
		
		// 1. MouseAdapter�̿� 
		class MyMouseListener extends MouseAdapter{
			
			//mousePressed�� �����ϸ� ��.
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				int x=e.getX(); // x��ǥ
				int y=e.getY(); // y��ǥ
				la.setLocation(x,y); // ���콺�� ������ ������ ���� ��ǥ ����
				super.mousePressed(e);
			}
		}
		
		// 1.MouseListener�̿� : interface�̱⶧���� �߻�޼ҵ� ���� �ʿ�
		
		/*
	
		class MyMouseListener implements MouseListener{

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int x=e.getX(); // x��ǥ
				int y=e.getY(); // y��ǥ
				la.setLocation(x,y); // ���콺�� ������ ������ ���� ��ǥ ����
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		}
		*/
			
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new MouseListenerEx();
		}

	}
