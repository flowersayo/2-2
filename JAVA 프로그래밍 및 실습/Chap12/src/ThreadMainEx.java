
public class ThreadMainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long id =Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority(); //�켱���� �⺻ ����Ʈ�� 5
		Thread.State s = Thread.currentThread().getState(); //������ ����
		
		System.out.println(name+' '+id+' '+priority+' '+s);
	}

}
