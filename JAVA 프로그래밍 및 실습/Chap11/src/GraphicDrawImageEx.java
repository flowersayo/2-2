import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicDrawImageEx extends JFrame {

	public GraphicDrawImageEx(){
		
		setTitle("���� �̹����� ���ϴ� ��ġ�� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		
		setSize(300,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
	ImageIcon icon = new ImageIcon ("./images/image0.jpg"); //�̹��� �ε�
	Image img = icon.getImage(); //�̹��� ��������
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(img,20,20,this); //�̹���, x��ǥ,y��ǥ, �̹��� �׸����� �ϷḦ �뺸�޴� ��ü
		
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicDrawImageEx ();
	}

}
