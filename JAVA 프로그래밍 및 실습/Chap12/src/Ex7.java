

import java.util.Scanner;


public class Ex7 implements Runnable{ //Runable �������̽��� �̿��ؼ� ����
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		//���� ���� ���� 1���� 10���� �ܼ�â�� ����� �� ����
			for(int i=1;i<=10;i++) {
				
				System.out.print(i+" ");
			}
			System.out.println("\n������ ����");
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("�ƹ�Ű�� �Է�>>");
		Scanner s =new Scanner(System.in);
		String str=s.next();
		
		System.out.println("������ ���� ����");
		
		
		Thread ex7 = new Thread(new Ex7()); //������ ��ü ����
		
		ex7.start(); //������ ����
		
		
		

		
	}
}

		
