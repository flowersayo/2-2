
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboActionEx extends JFrame {

	String [] fruits = { "apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
		ImageIcon [] images = {new ImageIcon("images/apple.jpg"),	
				new ImageIcon("images/banana.jpg"),	
				new ImageIcon("images/kiwi.jpg"),	
				new ImageIcon("images/mango.jpg")};
	JLabel imageLabel= new JLabel(images[0]); // �̹��� �󺧻��� - �ʱ��̹����� ����̹����� 
				
		//JList -> �ϳ��̻��� �������� �����ְ� �������� �����ϵ��� �ϴ� ����Ʈ. 
		//JList<E>(Object [] listData)
	
	public ComboActionEx () {
		
		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		var combo=new JComboBox<String>(fruits);
		c.add(combo);
		c.add(imageLabel);
		
		
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { //���콺������ ����
				// TODO Auto-generated method stub
				JComboBox <String> cb= (JComboBox)e.getSource(); 
				int index = cb.getSelectedIndex(); //���õ� �������� �ε��� ��������
				
				imageLabel.setIcon(images[index]); //imageLabel�Ǳ׸� �ٲٱ�.
				
			}
		});
	
		
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboActionEx ();
	}

}
