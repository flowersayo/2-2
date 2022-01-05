
public class SynchronizedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SharedPrinter p =new SharedPrinter();
		String [] engText= {"adfds","dfsasdf","asdfsadg","Ggdsa","gyhdfdf","SDggfd"};
		String [] korText= {"����������","����������","����������","��������","����������","����������"};
		
		Thread th1 = new WorkThread(p,engText);
		Thread th2 = new WorkThread(p,korText);
		
		th1.start();
		th2.start();
	}

}

class SharedPrinter{
	
synchronized void print(String text) {
		
		
		for(int i=0;i<text.length();i++) {
			System.out.print(text.charAt(i)); //i��° ���� ���
		}
		System.out.println();
	}
}


// SharedPrinter p , String [] text �� �������ָ� p�� print�Լ��� ���� ���ڿ��� �ϳ��� ȣ�����ִ� ������
class WorkThread extends Thread {
	
	SharedPrinter p;
	String [] text;
	
	public WorkThread(SharedPrinter p, String [] text) {
		this.p=p;
		this.text=text;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<text.length;i++) {
			p.print(text[i]); //���� ������ �̿��ؼ� i��°�� ���.
			
		}

	}
}