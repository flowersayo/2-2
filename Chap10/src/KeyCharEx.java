import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCharEx extends JFrame {

	JLabel la=new JLabel("����Ű�� ������ �ٲ�ϴ�.");
			
	public KeyCharEx(){
		super("Ű���� �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(la);
		c.addKeyListener(new MyKeyListner());
		// â�� ������ �������� ��Ŀ�� ���
		
		
		//Ű���常 ����ϴ� ��� �ٿ��ٰ�.
		c.setFocusable(true);
		c.requestFocus();

		setSize(250,150);
		setVisible(true);
	}
	class MyKeyListner extends KeyAdapter{
		
		//����Ű�� ������ ���� �������� ���� �����ϱ�.
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
			int r =(int)(Math.random()*256);
			int g=(int)(Math.random()*256);
			int b= (int)(Math.random()*256);
			
			// 1. KeyEvent.getKeyChar() : Ű�� �����ڵ�(�����ڵ�) �˾Ƴ��� 
			// 2. KeyEvent.getKeyCode() : �Էµ� Ű�� ���� Ű �� �˾Ƴ���
			// 3. keyEvent.getKeyText(keyCode) : keyCode�� �ڵ� ���� �ش��ϴ� Ű�� �̸� ���ڿ� ���� ex) F1,SHIFT
			
			System.out.println(e.getKeyText(10));
			switch (e.getKeyChar()) {
			

			case '\n': 
				la.setText("r= " +r+","+"g = "+g+","+"b = "+b);
				
				getContentPane().setBackground(new Color(r,g,b));
				break;
			case 'q' : 
				System.exit(0); // �ý��� ���� ����
			}

		
			//super.keyPressed(e);
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new KeyCharEx();
	}

}
