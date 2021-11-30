	import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

	public class InnerClassListener extends JFrame {

		public InnerClassListener () {
			setTitle("���� Ŭ������ �̺�Ʈ �����");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container c=getContentPane();
			c.setLayout(new FlowLayout());
			JButton btn =new JButton("Action");
			c.add(btn);
			
			btn.addActionListener(new MyActionListener());
			setSize(250,120);
			setVisible(true);
		}

		// ���� Ŭ���� ���ο� ���� Ŭ���� �ۼ�
		class MyActionListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton b=(JButton)e.getSource(); // �̺�Ʈ�ҽ� ��������.
				if(b.getText().equals("Action")) // �̺�Ʈ �ҽ��� ���ڰ� Action�̸�
					b.setText("�׼�"); //��ư �ؽ�Ʈ �ٲٱ�
				else
					b.setText("Action");
				
				// ������ Ÿ��Ʋ���� �����ض�
				// Q. InnerClassListener.this �� �ǹ��ϴ¹�
				InnerClassListener.this.setTitle(b.getText());
			}
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new InnerClassListener();
		}
		


	}

	