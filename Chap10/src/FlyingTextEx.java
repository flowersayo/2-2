import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame {

	JLabel la = new JLabel("HELLO");
	
	public FlyingTextEx() {
		super("�ؽ�Ʈ ���ƶ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		la.setSize(50,50);
		la.setLocation(100,20);
		c.add(la);
		
		setSize(200,200);
		setVisible(true);
		
		// �̺�Ʈ�� c���� la�� �ٿ��� �ǳ�? ����! ��� ��Ŀ���� la�� �־����.
		la.addKeyListener(new MyKeyListener( ));
		
		la.setFocusable(true);
		la.requestFocus();
	}
	
	//Listener �� extends ���. Adapter�� implements ����
	class MyKeyListener extends KeyAdapter {
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
			
			//getKeyCode�� String�� �ƴ϶� int! 
			int keycode = e.getKeyCode(); // �̺�Ʈ�� �߻��ϸ� Ű �ڵ尪 ������. 
			
			switch (keycode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(),la.getY()-10);
				break;
				
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(),la.getY()+10);
				break;
				
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-10,la.getY());
				break;
				
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+10,la.getY());
				break;
				

			}
			super.keyPressed(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}

}
