

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//�̸��̶� ������ ������ �ؽ��� �����
		
		HashMap <String,Float> scoreMap = new HashMap <String,Float>();
		
		Scanner s= new Scanner(System.in);
		//5���� �� �����
		System.out.println("�̷����бݰ����ý����Դϴ�.");
		for(int i=0;i<5;i++) {
			System.out.print("�̸��� ����>>");
			String name=s.next();
			float score=s.nextFloat();
			scoreMap.put (name,score);
			
			
		}
		
		System.out.print("���л� ���� ���� ���� �Է� >>");
		
		float k =s.nextFloat(); //���� ����
		
		// HashMap�� Iterator ���� ���ϹǷ� keySet�̿��ؾ���.
		Set<String> keys=scoreMap.keySet(); //Hashmap Ű�� ��������
		Iterator<String> it = keys.iterator(); 
		
		
		System.out.print("���л� ��� :");
		while(it.hasNext()) { //HashMap ��ȸ
			
			String key = it.next();
			
			if (scoreMap.get(key)>=k) // ���� ������ ����Ѵٸ�
			System.out.print(key+' '); // �޸𸮻� ������� ����Ǵ� ���� �ƴ�. 
		}
	}

}
