import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicDrawLineEx extends JFrame {

	public GraphicDrawLineEx(){
		
		setTitle("���� �׸��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		
		setSize(200,150);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawLine(20, 20, 100, 100);// (20,20) -> (100,100) �� �մ� ���� �׸�.
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicDrawLineEx ();
	}

}
