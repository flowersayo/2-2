import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{

	public FlowLayoutEx() {
		
		setTitle("�÷ο� ���̾ƿ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentpane=getContentPane();
		
		//���ο� ��ġ������ ����.
		// Flowlayout : ���� -> ������ ��ġ . ���Ĺ��, ���򰣰�,�������� 
		contentpane.setLayout(new FlowLayout(FlowLayout.CENTER,30,0)); //
		
		contentpane.add(new JButton("add"));
		contentpane.add(new JButton("sub"));
		contentpane.add(new JButton("div"));
		contentpane.add(new JButton("mul"));
		contentpane.add(new JButton("Calculate"));
		
		setSize(300,200); //contentpane�� ũ��
		setVisible(true); // ���̵����ϱ�.
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new FlowLayoutEx();
	}

}
