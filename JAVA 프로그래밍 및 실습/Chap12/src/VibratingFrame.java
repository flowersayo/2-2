
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class VibratingFrame  extends JFrame implements Runnable { //JFrame�̸鼭 ���ÿ� �����忪��

	Thread th; // �������� ������Ű�� ������
	public VibratingFrame () {
		
		setTitle("�����ϴ� ������ �����Ű�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(250,200);
		setVisible(true);
		setLocation(500,500);
		

		Container c= getContentPane();
		c.addMouseListener(new MouseAdapter() { //Adapter�� Listener�� ���� �����ؾ���.
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if(!th.isAlive())  //�����尡 ������������� 
					return;
				
				th.interrupt(); // �����尡 ��������� ����
				
			}
		});
		
		th = new Thread (this); //�����ϴ� ������ ��ü ����
		th.start();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VibratingFrame();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random r= new Random();
		
		while(true) {
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO: handle exception
				return;
			}
			
			
			//���������� ���� ��ǥ���� +=5
			int x=getX()+r.nextInt()%5;
			int y=getY()+r.nextInt()%5;
			setLocation(x,y); 
			
		}
	}

}
