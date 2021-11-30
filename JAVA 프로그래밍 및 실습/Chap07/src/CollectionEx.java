import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionEx {

	
	static void printList (LinkedList<String> list) {
		
		Iterator <String> it = list.iterator();
		
		while (it.hasNext()) {
		String e =it.next();
		String separator;
		
		
		if (it.hasNext()) // �������� ������.
			separator = "->";
		else
			separator = "\n";
			
		System.out.print(e + separator);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <String> myList = new LinkedList<String>();
		myList.add("Ʈ");
		myList.add("��");
		myList.add("��");
		myList.add(0,"��");
		myList.add(2,"��");
		
		Collections.sort(myList);
		printList(myList);
		Collections.reverse(myList);
		printList(myList);
		
		int idx = Collections.binarySearch(myList, "��")+1; //�� �� ���° �������
		System.out.println(idx+"��° ���");
	}

}
