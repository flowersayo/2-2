
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


class TimerRunnable implements Runnable{
	
	JLabel timerLabel; //�����忡 ����� ��� ���۷���
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel=timerLabel;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n=0;
		while(true) {
			
			timerLabel.setText(Integer.toString(n++));
			
			
			try {
				Thread.sleep(1000); //thread�� try catch �ʼ�
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				return;
			}
		}
		
	}
}
public class RunnableTimerEx  extends JFrame {

	public RunnableTimerEx() {
		
		setTitle("�������̽� Runnable�� ���� �������������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
				
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel);
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable); // ������������� ���ڷ� Runnable.
		th.start(); //������ ����
		
		
		setSize(250,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RunnableTimerEx();
	}

}
