import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

	public class NullContainer extends JFrame{

		public NullContainer() {
			
		
			setTitle("�����Ӱ� ��ġ�ϴ� ,��ġ�����ڰ� ���� NullContainer");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container contentpane=getContentPane();
			
			contentpane.setLayout(null);// ��ġ������ ����
			
			// NullContainer�� ������Ʈ�� ������ ũ��,��ġ�� �������־����.
			// ���������� ������ ȭ�鿡 ��� X
			
			var la = new JLabel("Hello Press Button!");
			la.setLocation(130,50); // ��ư ��ġ ����
			la.setSize(200,20); //��ư ũ�� ����
			contentpane.add(la);
			
			for(int i=1;i<=9;i++) {
				JButton b=new JButton(Integer.toString(i));
				b.setLocation(i*15,i*15);
				b.setSize(50,20);
				contentpane.add(b);
			}
			
			
			setSize(300,200); //contentpane�� ũ��
			setVisible(true); // ���̵����ϱ�.
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		new NullContainer();
		}

	}
