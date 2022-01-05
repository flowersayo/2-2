
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyLabel extends JLabel{
	int barSize=0; //���������
	int maxBarSize; // �ִ������
	
	public MyLabel(int maxBarsize) {
		this.maxBarSize=maxBarsize;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.MAGENTA);
		int width =(int)(((double) this.getWidth()/maxBarSize*barSize ));
		
		if(width==0)
			return;
		g.fillRect(0, 0, width, this.getHeight()); 
		
	}
	
	synchronized void fill() {
		if(barSize==maxBarSize)
			try {
				wait();
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				return;
			}
		
		System.out.println("fill");
		barSize++; //������ �ƴ϶�� barSize�ø�
		repaint();//�ٽñ׸�
		notify(); //������� ������ ����.
	}
	
	synchronized void consume() {
		if(barSize ==0)
			try {
				wait(); 
				System.out.println("consume ������");
			} catch (InterruptedException e) {
				// TODO: handle exception
				return;
			}
		barSize--;
		repaint();
		System.out.println("consume");
		notify(); //wait���¿� ���� ������ �ϳ��� �����. 
		
	}
}

// bar�� �������� ���ҽ�Ű�� ������
class ConsumerThread extends Thread{
	MyLabel bar;
	
	public ConsumerThread(MyLabel bar){
		this.bar=bar;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				sleep(1000);
				bar.consume();
			}
			catch(InterruptedException e) {
				return;
			}
		}
		//super.run(); //�̹��� �����
	}
}
public class TabAndThreadEx extends JFrame {

	
	MyLabel bar = new MyLabel(100); //Ŀ���� �� Ŭ���� ��ü
	public TabAndThreadEx() {
		
		setTitle("Tab���� ������ ä��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(null);
		
		bar.setBackground(Color.ORANGE);  //�⺻ ����
		bar.setOpaque(true);
		bar.setSize(300,20);
		bar.setLocation(20,50);
		c.add(bar);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				 bar.fill();
			}
		});
		
		
		setSize(350,200);
		setVisible(true);
				
		c.setFocusable(true);
		c.requestFocus();
		ConsumerThread th = new ConsumerThread (bar);
		th.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TabAndThreadEx();
	}

}
