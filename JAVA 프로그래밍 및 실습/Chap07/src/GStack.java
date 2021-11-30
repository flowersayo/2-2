
public class GStack <T>{
	
	int tos;
	Object [] stack; //�迭 ���۷��� ����
	
	public GStack() {
		tos = 0;
		stack = new Object[10]; //���� �迭 ���� ����
		
	}
	
	public void push(T item) {
		if(tos==10)
			return;
			stack[tos++]=item;
		
	}
	
	public T pop () {
		if(tos==0)
			return null;
		return (T)stack[--tos];
		
	}
	
	
}