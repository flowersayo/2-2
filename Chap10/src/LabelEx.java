import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {

	public LabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		//JLabel  : ���ڿ��̳� �̹����� ȭ�鿡 ���
		//JLabel (String txt ,Icon img , int hAlign)
		
		
		//1.���ڿ� ��
		JLabel textLabel =new JLabel("���ӽ�����");
		
		//2.�̹��� ��
		ImageIcon img=new ImageIcon ("images/gosling.jpg"); // 1. �̹����ε���
		JLabel imageLabel =new JLabel(img); //2.�̹����� ���̺� ����.
		
		//3. ���ڿ�+�̹�����
		ImageIcon icon=new ImageIcon("images/icon.gif");
		JLabel label =new JLabel("Ŀ������ �ϽǷ���, ��ȭ ���̼�",icon,SwingConstants.CENTER);
		label.setBackground(Color.RED);
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(300,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();
	}

}
