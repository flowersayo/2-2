import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {

	public CheckBoxEx() {
		
		setTitle("üũ�ڽ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��");
		JCheckBox cherry = new JCheckBox("ü��");
		
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxEx();
	}

}
