import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var al =new ArrayList<String>();
		
		Scanner s=new Scanner(System.in);
		
		for (int i=0;i<4;i++) {
			System.out.println("�̸��� �Է��ϼ���");
			String string=s.next();
			al.add(string);
		}
		
		
		int longestIndex=0;
		
		for (int i=0;i<al.size();i++) {
			String name=al.get(i);
			System.out.println(name+ " ");
			if (al.get(longestIndex).length()<al.get(i).length())
				longestIndex=i;
		}
		
		System.out.println("���� �� �̸��� :" + al.get(longestIndex) );
		s.close();
		
		
		
	}

}
