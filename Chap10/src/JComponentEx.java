import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame {

	
	public JComponentEx() {
		super("JComponent�� �޼ҵ� ����"); //Ÿ��Ʋ ����
		
		Container c=getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X��ư������ Ȯ���� ����
		c.setLayout(new FlowLayout()); //��ġ����
		
		JButton b1 =new JButton("Megenta/Yellow Button");
		JButton b2 =new JButton(" Disable Button");
		JButton b3 =new JButton("getX() ,get Y()");
		
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.MAGENTA); // ���ڼ�
		b1.setFont(new Font("Arial",Font.ITALIC,20));
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener() { //���콺�� <Enter>Ű�� ��ư�� �����Ұ��.
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b= (JButton)e.getSource(); // �׼��� �߻��� �ҽ����޾�
				setTitle(b.getX()+","+getY()); // ��ǥ�� Ÿ��Ʋ�� ���
			}
		});
		
		//��ư�� ContentPane�� ����
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		
		setSize(260,200); // ���� ������Ʈ�� ���� �޼ҵ�
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new JComponentEx();
	}

}
