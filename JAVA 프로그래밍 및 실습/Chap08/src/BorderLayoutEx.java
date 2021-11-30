import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{

	public BorderLayoutEx() {
		
		setTitle("BorderLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentpane=getContentPane();
		
		//���ο� ��ġ������ ����.
		// BorderLayout : �����̳��� ������ 5�������� ���� ��ġ
		// add( ������Ʈ, ��ġ )
		contentpane.setLayout(new BorderLayout()); //
		
		contentpane.add(new JButton("add"),BorderLayout.NORTH);
		contentpane.add(new JButton("sub"),BorderLayout.SOUTH);
		contentpane.add(new JButton("div"),BorderLayout.WEST);
		contentpane.add(new JButton("mul"),BorderLayout.EAST);
		contentpane.add(new JButton("Calculate"),BorderLayout.CENTER);
		
		
		setSize(300,200); //contentpane�� ũ��
		setVisible(true); // ���̵����ϱ�.
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new BorderLayoutEx();
	}

}
