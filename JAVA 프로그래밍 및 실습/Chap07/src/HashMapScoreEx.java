import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class HashMapScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//�̸��̶� ������ ������ �ؽ��� �����
		
		HashMap <String,Integer> scoreMap = new HashMap <String,Integer>();
		
		//5���� �� �����
		
		scoreMap.put ("�輺��",97);
		scoreMap.put ("Ȳ����",88);
		scoreMap.put ("�賲��",98);
		scoreMap.put ("���繮",70);
		scoreMap.put ("�ѿ���",99);
		
		
		System.out.println("�ؽ����� ��� ����: " + scoreMap.size());
		
		
		Set<String> keys=scoreMap.keySet(); //Hashmap Ű�� ��������
		Iterator<String> it = keys.iterator(); 
		
		
		while(it.hasNext()) { //HashMap ��ȸ
			
			System.out.println(it.next()); // �޸𸮻� ������� ����Ǵ� ���� �ƴ�. 
		}
	}

}
