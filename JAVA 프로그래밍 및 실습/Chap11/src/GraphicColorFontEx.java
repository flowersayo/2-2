import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicColorFontEx extends JFrame{

	public GraphicColorFontEx() {
		setTitle("���ڿ�, �÷�, ��Ʈ ��뿹��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	class MyPanel extends JPanel{ //�׳� Panel�ƴԿ� ����
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawString("�ڹٰ� ���� ��ճ�", 30, 30);
			
			g.setColor(new Color(255,0,0)); //red
			g.setFont(new Font ("Arial",Font.ITALIC,30)); //��Ʈ��,���ڽ�Ÿ��,ũ��
			// �׳� �ٷ� ���ڸ� �־� �����ϴ°��� �ƴ϶�, ���� Font ��ü�� �����ϰ� �װ��� ���ڷ� �־���Կ� ����
	
			g.drawString("How much?", 30, 70);
			
			g.setColor(new Color(0X00ff00ff)); //�÷�����ڵ� +�������� ǥ���ؼ� 8�ڸ� ���ֻ�
			
			// draw�ϱ����� color,font�� �ѹ��� �����ص���
			for(int i=1;i<=4;i++) {
				g.setFont(new Font("Jokerman",Font.ITALIC,i*10)); 
				g.drawString("This much!!", 30, 60+i*40);
				
			}
			
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicColorFontEx();
	}

}
