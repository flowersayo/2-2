
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

//���� �Ÿ��� ���̺��� �����ϴ� Ŭ���� 
class FlickingLabel extends JLabel implements Runnable{

	long delay;
	
	public FlickingLabel(String text,long delay) {
		// TODO Auto-generated constructor stub
		
		super(text); //Jlabel �� text����
		this.delay=delay; //������ ����
		setOpaque(true); //���� ������ �����ϵ���
		
		
		Thread th =new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int n=0; //ī��Ʈ ����
		
		while(true) {
			if(n==0)
				{ setBackground(Color.YELLOW);
				   n=1;
				
				}
			else
				{setBackground(Color.GREEN);
						n=0;
				}
			
			try {
				Thread.sleep(delay); // delay��ŭ ����.
				
			} catch (InterruptedException e) { //������ ����ó�� InterruptedException
				// TODO: handle exception
				return;
			}
			
			
		}
	}
	
	
	
	
}
public class FlickingLabelEx  extends JFrame {

	public FlickingLabelEx() {
		
		setTitle("�����Ÿ��� �۾� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		
		//���ڰŸ��� ���̺�
		FlickingLabel fLabel= new FlickingLabel("����(500)", 500);
		
		//���ڰŸ��� �ʴ� ���̺�
		JLabel label = new JLabel("�ȱ���");

		
		//���ڰŸ��� ���̺�
		FlickingLabel fLabel2= new FlickingLabel("���⵵ ����(300)", 300);
		
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		
		setSize(300,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlickingLabelEx();
	}

}
