import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

// screen �޴��� 4���� �޴� �������� �����.
// Load�� �����ϸ� �̹����� ������ �ʰ��ϰ�, Hide�� �̹����� ������ �ʰ��ϸ�
// ReShow�� ������ �̹����� �ٽ� ���̰��ϰ�, Exit�� �����ϸ� ���α׷��� �����ϵ��� Action ������ �ۼ�.

public class MenuEx extends JFrame {

	public MenuEx() {
		
		setTitle("�޴��� Action ������ Ȱ�뿹�� ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createMenu();
		setSize(250,200);
		setVisible(true);
		
	}
	
	//JMenuBar ->  JMenu -> JMenuItem
	void createMenu() {
		
		JMenuBar mb =new JMenuBar(); //�޴��� ����
		JMenu screenMenu = new JMenu ("Screen"); // ��ũ�� �޴� ����
		
		
		//�޴� ������ �����ؼ� ���̱�
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator(); //ReShow Exit ���̿� �и����߰�
		screenMenu.add(new JMenuItem("Exit"));
	
		
		mb.add(screenMenu); // ��ũ�� �޴��� �޴��ٿ� ���̱� 
		mb.add(new JMenu("Edit")); 
		mb.add(new JMenu("Source")); 
		mb.add(new JMenu("Project")); 
		mb.add(new JMenu("Run")); 
		
		
		setJMenuBar(mb);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuEx();
	}

}
