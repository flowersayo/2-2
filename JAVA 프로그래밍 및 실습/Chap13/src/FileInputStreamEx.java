import java.io.FileInputStream;
import java.io.IOException;

//����� ���̳ʸ� ����(.out)�о���� 
public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b[] =new byte[6];
		
		try {

			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			int n=0,c;
			
			while((c=fin.read())!=-1) { //read�� ����Ʈ ������ �о int ���������� ��ȯ. 
				b[n]= (byte)c; //����ȯ�ʼ�! 
						n++;
			}
			
			System.out.println("���� �迭 ����ϱ�");
			
			for(int i=0;i<b.length;i++)
				System.out.println(b[i]);//+ ' '���� ������ �������� ��µ� �ƿ� ����
			
			System.out.println();
			
			fin.close(); //�� �ݱ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("����¿���");
		}
	}

}
