import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// ctrl +shift + o �� �ڵ� import�� �ۼ�
//ctrl +space �� �ڵ��ϼ��ĺ�

public class ContentPaneEx extends JFrame {

	public ContentPaneEx() {
		
		setTitle("��ư 3�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�� ������ ���α׷�(����)�� ����
		Container contentpane = getContentPane();
		
		contentpane.setBackground(Color.ORANGE);
		
		contentpane.setLayout(new FlowLayout()); //�Ϸ� ��ġ
		
		contentpane.add(new JButton("OK"));
		contentpane.add(new JButton("Cancel"));
		contentpane.add(new JButton("Ignore"));
		
		
		setSize(300,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//ContentPaneEx content=new ContentPaneEx();
		new ContentPaneEx(); // �̸� ���� ����. 
	}

}
