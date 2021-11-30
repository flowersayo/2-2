import java.util.HashMap;
import java.util.Scanner;



class Student {
	
	private int id;
	private String tel;
	public Student (int id,String tel) {
		this.id=id;
		this.tel=tel;
		
	}
	public int getId () {
		return id;
	}
	
	public String getTel() {
		return tel;
	}
	
}

public class HashMapStudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//�迭 ����� ����: 1.�̸� 2. �� 3.�濡����
		
		// key :�̸� ,Value: Student ��ü
		HashMap<String,Student> map =new HashMap< String,Student>();
		
		map.put("a", new Student(1,"010-1111-1111"));
		map.put("b", new Student(2,"010-2222-2222"));
		map.put("c", new Student(3,"010-3333-3333"));
		
		Scanner s =new Scanner (System.in);
		
		while (true) {
			
			System.out.println("�˻��� �̸�");
			String name = s.next();
			
			if (name =="exit")
				break;
			
			Student std = map.get(name);
			if(std==null )
				System.out.println("����x");
			else
				System.out.println("id : " + std.getId() +" tel : "+ std.getTel());
		}
		
	
			
		s.close();
		
		
	}

}
