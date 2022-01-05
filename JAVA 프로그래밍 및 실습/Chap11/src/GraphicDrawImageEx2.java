import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicDrawImageEx2 extends JFrame {

	public GraphicDrawImageEx2(){
		
		setTitle("�г��� ũ�⿡ ���� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		
		setSize(200,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
	ImageIcon icon = new ImageIcon ("./images/image0.jpg"); //�̹��� �ε�
	Image img = icon.getImage(); //�̹��� ��������
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		//�г��� ũ�⿡ ���缭 �׸���
		g.drawImage(img,0,0,getWidth(),getHeight(),this); //�̹���, x��ǥ,y��ǥ,����ũ��,����ũ��, �̹��� �׸����� �ϷḦ �뺸�޴� ��ü
		
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicDrawImageEx2 ();
	}

}
