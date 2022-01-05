import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


//screen �޴��� 4���� �޴� �������� �����.
//Load�� �����ϸ� �̹����� ������ �ʰ��ϰ�, Hide�� �̹����� ������ �ʰ��ϸ�
//ReShow�� ������ �̹����� �ٽ� ���̰��ϰ�, Exit�� �����ϸ� ���α׷��� �����ϵ��� Action ������ �ۼ�.

public class MenuActionEventEx extends JFrame {
	
	
	JLabel imageLabel = new JLabel();
	
	public MenuActionEventEx() {
		
		setTitle("�޴��� �׼Ǹ����� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		
		getContentPane().add(imageLabel,BorderLayout.CENTER); //�̹��� �� ���̱�
		setSize(250,200);
		setVisible(true);
		
	}

	//JMenuBar ->  JMenu -> JMenuItem
	void createMenu() {
		
		JMenuBar mb =new JMenuBar(); //�޴��� ����
		JMenuItem [] menuItems = new JMenuItem[4];
		String [] itemTitles =  {"Load","Hide","ReShow","Exit"}; //�޴������� ����Ʈ
		JMenu screenMenu = new JMenu ("Screen"); // ��ũ�� �޴� ����
		
	
		
	
		// !����! ��ũ�� �޴��� action listener�� ���̴°� �ƴ϶� ������ �޴� �����ۿ� �ٿ�����
		//screenMenu.addActionListener(new MenuActionListener()); -> X
		
		//�޴� �׼� ������ ���� (1ȸ���ؼ� ��������) 
		MenuActionListener listener = new MenuActionListener();
		
		//�޴� ������ �����ؼ� �̺�Ʈ ������ ���̱�
		for(int i=0;i<itemTitles.length;i++) {
			
			 menuItems[i]=new JMenuItem(itemTitles[i]); //�޴������� ����
			 menuItems[i].addActionListener(listener); // �޴��׼Ǹ����� ���̱�.
			 screenMenu.add(menuItems[i]);
		}
		
		mb.add(screenMenu);
		setJMenuBar(mb); //�޴��ٸ� �����ӿ� ����.
		
	}
	
	class MenuActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String cmd =e.getActionCommand(); // Ŭ���� �޴� ������ ��Ī ��ȯ
			switch (cmd) {
			case "Load" :
				if(imageLabel.getIcon()!=null) //�̹� �󺧿� set �� icon�� �����Ѵٸ�
					return; //load�̹� �Ǿ������Ƿ� ����
				imageLabel.setIcon(new ImageIcon("images/apple.jpg"));
				break;
				
			case "Hide" :
				imageLabel.setVisible(false); //������ �ʰ���.
				break;
			
			case "ReShow" : 
				imageLabel.setVisible(true); //���̰���.
				break;
				
			case "Exit" :
				System.exit(0); //����
				break;
			
				
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuActionEventEx();
	}

}
