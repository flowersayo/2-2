import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	HashMap<String,String> dic = new HashMap<String,String>();
	
	dic.put("baby", "�Ʊ�");
	dic.put("love", "���");
	dic.put("apple", "���");
	
	//dic���� key���� �����ͼ� iterator�� ����ϱ�
	Set<String> keys=dic.keySet();
	
	var it =keys.iterator();
	while(it.hasNext()) {
		String key=it.next();
		String value = dic.get(key); //key���� �ش��ϴ� value�� ������
		System.out.println(key + " " +value);
	}
	
	Scanner s=new Scanner (System.in);
	while(true){
		System.out.println("ã����� �ܾ��?");
		String eng=s.next();
		String kor =dic.get(eng);
		
		if(kor ==null)
			System.out.println(eng+ "�� ���� �ܾ��Դϴ�");
		else
			System.out.println(kor);
	}
	
	
	}

}
