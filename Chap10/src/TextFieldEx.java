import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {

	
	//JTextField(String txt, int cols) : �ʱ�ȭ���ڿ�, �Է�â�� ������
	JTextField tf = new JTextField(20); 
	
	//JTextArea (width,height)
	JTextArea ta = new JTextArea(7, 20); // ���ٿ� 20���ڰ� �Է� �����ϸ� 7�ٷ� ����. (��,��)
	
	public TextFieldEx() {
		
		setTitle("�ؽ�Ʈ ���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
			/*
		c.add(new JLabel("�̸�  "));
		c.add(new JTextField(20)); 
		
		c.add(new JLabel("�а�  "));
		c.add(new JTextField(20)); 
		
		c.add(new JLabel("�ּ�  "));
		c.add(new JTextField(20)); 
		*/
		
		//�ؽ�Ʈ �ʵ忡 ���ڿ��� �Է��� ��<Enter>Ű�� �Է��ϸ� �ؽ�Ʈ ����â�� ���ڿ��� �߰��ϰ�, �ؽ�Ʈ�ʵ� �Է�â�� ġ��� ���α׷�. 
		
		c.add(new JLabel("�Է��� ����Ű�� �Է��ϼ���"));
		c.add(tf);
		
		tf.addActionListener(new ActionListener() { //���콺 Ŭ�� or enterŰ ��������
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JTextField t=(JTextField)e.getSource(); //�׼��� perform�� �ҽ� ��������
				ta.append(t.getText()+'\n'); // text area�� ���� �߰��ϱ�
				t.setText(""); // ��Ʈ���ʱ�ȭ
			}
		});
		c.add(new JScrollPane(ta)); // text area�� ��ũ�Ѻ� �߰�
	
		
		setSize(300,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}