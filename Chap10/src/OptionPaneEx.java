import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class OptionPaneEx extends JFrame {

	public OptionPaneEx () {
		setTitle("�ɼ� �� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		
		
		// add�ϸ鼭 ���̴� ������Ʈ�� ��ġ�� ���� �����ϱ�.
		c.add(new MyPanel(),BorderLayout.NORTH);
		setSize(500,200);
		setVisible(true);
		
	}
	
	//class�ȿ� class����� ����.
	class MyPanel extends Panel{
		
		// �гο� �� ���� ��ҵ� ����
		JButton inputBtn =new JButton ("Input Name");
		 JTextField tf = new JTextField(10);
		 JButton confirmBtn =new JButton("Confirm");
		 JButton messageBtn =new JButton("Message");
		 
		 public MyPanel() {
			 
			 //�гο� ����
			 setBackground(Color.LIGHT_GRAY);
			 add(inputBtn);
			 add(confirmBtn);
			 add(messageBtn);
			 add(tf);
			 
			 //��ǲ ��ư�� �̺�Ʈ ������ �߰�
			 inputBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String name =JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
					
					if( name!=null) {
						tf.setText(name);
					}
				}
			});
			 
			 confirmBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					// ȭ�� �߾�����, ����, Ÿ��Ʋ, ��ư����
					int result= JOptionPane.showConfirmDialog(null,"����� ���Դϱ�?","Confirm",JOptionPane.YES_NO_OPTION);
					
					if(result==JOptionPane.CLOSED_OPTION) { //��,�ƴϿ� ���þ��� ���̾�α� â�� �������
						tf.setText("Just Closed Without Selection");
						
					}
					else if (result==JOptionPane.YES_OPTION) {
						tf.setText("YES");
					}
					else {
						tf.setText("NO");
					}
				}
			});
						
				messageBtn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						JOptionPane.showMessageDialog(null, "�����ϼ���","Message",JOptionPane.ERROR_MESSAGE);
					}
				});
		 }
		 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OptionPaneEx();
	}

}
