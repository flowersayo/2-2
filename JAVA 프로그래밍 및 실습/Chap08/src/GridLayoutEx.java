import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame{

	public GridLayoutEx() {
		
		setTitle("BorderLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentpane=getContentPane();
		
		//���ο� ��ġ������ ����.
		// GridLayout : ������ �簢��(����)�� �����ϰ� �� ���� �ϳ��� ������Ʈ ��ġ
		// ������Ʈ�� Add�Ǵ� ������� ��ܿ��ʺ��� ���ʴ�� ä����
		// GridLayout (���,����,���򰣰�,��������)
		contentpane.setLayout(new GridLayout(1,10)); // 1�� 10�� 
		
		for(int i=0;i<10;i++) {
			String text= Integer.toString(i);
			JButton jb =new JButton(text);
			contentpane.add(jb);
		}
		
		//�ʰ��� ��� �׳� ���� ������. 
		contentpane.add(new JButton("new"));
		setSize(500,100); //contentpane�� ũ��
		setVisible(true); // ���̵����ϱ�.
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new GridLayoutEx();
	}

}
