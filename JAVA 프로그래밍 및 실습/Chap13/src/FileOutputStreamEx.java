import java.io.FileOutputStream;
import java.io.IOException;

//���̳ʸ����� ���
public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//byte�� ǥ�� ���� -128  ~ 127   
		byte b[] = {65,66,67,68,69,70}; //int �� �ٲ� ������� .
		
		try {
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
			

			for(int i=0;i<b.length;i++) 
				fout.write(b[i]);
			
			// A B C D E F ����
			fout.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("����");
		}
		
		System.out.println("�����߽��ϴ�."); 
	}

}
