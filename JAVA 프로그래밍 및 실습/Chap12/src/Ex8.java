import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;



//�ؽ�Ʈ ���� ���� (���� ��Ʈ�� FileReader,FileWriter �̿�) 
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStreamReader rd = new  InputStreamReader (System.in);

		
		int c; 
		Scanner s=new Scanner(System.in);
		
		try {
	
			FileWriter fout = new FileWriter("c:\\Temp\\test.txt");
			while(true) { //���� �ϳ� �а�
				System.out.println("���� �Է� ���α׷��Դϴ�.");

				System.out.print("�̸� ����>>");
				String line =
			
			
				fw.write((char)c);  //���� �ϳ� ���� 
				System.out.println("*");
			}
			
			rd.close();
			fw.close(); //��Ʈ���ݴ°� ��������!!!!!
			System.out.println(src.getPath() +"->"+dest.getPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("����� ����");
		}
		
		

}

