import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImageEx extends JFrame{

	
	public ButtonImageEx() {
		
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		//�ʿ��� �̹��� �ҷ�����
		ImageIcon normalIcon =new ImageIcon("images/normalicon.gif");
		ImageIcon rolloverIcon =new ImageIcon("images/rollovericon.gif");
		ImageIcon pressedIcon =new ImageIcon("images/pressedicon.gif");
		
		JButton btn = new JButton("call...",normalIcon);
		btn.setPressedIcon(pressedIcon); //��ư Ŭ���� �̹��� ����
		btn.setRolloverIcon(rolloverIcon); //��ư�� ���콺�÷����� �̹���

		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonImageEx();
	}

}
