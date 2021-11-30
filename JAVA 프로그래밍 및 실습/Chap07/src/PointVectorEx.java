import java.util.Vector;

class Point {
	private int x,y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString () {
		return "(" +x+","+y+")";
	}
}
public class PointVectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var v= new Vector<Point>(); //��ü�迭 ���۷��� ����
		
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		v.remove(1); //v[1] �� (-5,20) �� ����
		
		//Q. elementAt �ϰ� get �� ������?
		for(int i=0;i<v.size();i++) {
				Point p=v.get(i);
			System.out.println(p.toString());
		
		}
		
	}

}
