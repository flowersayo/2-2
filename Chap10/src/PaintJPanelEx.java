import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintJPanelEx extends JFrame {

	
	public PaintJPanelEx() {
		setTitle("JPanel�� ����Ʈ ������Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel()); // ����Ʈ���� �����ͼ� ���̴°� �ƴ϶� panel��ü�� ����Ʈ������ ����.
		setSize(250,200);
		setVisible(true);
		
	}
	 
	class MyPanel extends JPanel{
		
		//pa ������ġ�� ctrl-enter ������ �ڵ��ϼ�
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.fillRect(10,10,50,50);
			g.fillRect(50,50,50,50);
			
			g.setColor(Color.MAGENTA);
			g.drawRect(90,90,50,50);
		}
		
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PaintJPanelEx();
	}

}
