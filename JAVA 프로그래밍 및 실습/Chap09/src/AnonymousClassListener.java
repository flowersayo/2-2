import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame {

	public AnonymousClassListener () {
		setTitle("���� Ŭ������ �̺�Ʈ �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn =new JButton("Action");
		c.add(btn);
		
		// addListener �� ���ڿ��� �̺�Ʈ �����ʸ� ���� �����ϱ�.
		btn.addActionListener(new  ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton b=(JButton)e.getSource(); // �̺�Ʈ�ҽ� ��������.
				if(b.getText().equals("Action")) // �̺�Ʈ �ҽ��� ���ڰ� Action�̸�
					b.setText("�׼�"); //��ư �ؽ�Ʈ ����.
				else
					b.setText("Action");
				
				setTitle(b.getText()); //������Ÿ��Ʋ ����
						
			}
			
		}
);
		setSize(250,120);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonymousClassListener();
	}

}

