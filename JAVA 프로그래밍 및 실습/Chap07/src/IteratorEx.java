import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector<Integer> v =new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		// 5 4 100 -1
		
		
		//iterator�� Ȱ���� ���� ��ȸ
		var it =v.iterator();
		
		int sum=0;
		while (it.hasNext()) {
			
			int n=it.next();
			sum+=n;
			System.out.println(n);
			
		}
		
		System.out.println("���Ϳ��ִ� ���� �� :" +sum);
	}

}
