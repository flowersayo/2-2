
import java.io.FileReader;
import java.io.IOException;

//���� �б�
public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in =null;
		
		try {
			in =new FileReader("c:\\windows\\system.ini");
			int c;
			
			// ���ڽ�Ʈ���� 2����Ʈ�� �����ڵ� ���ڸ� ������ ������ϴ� ��Ʈ��.
			// byte�� 1byte char�� 2byte int�� 4btye
			while((c=in.read())!=-1){//in.read() �� 1 byte�� �о� int Ÿ������ �����Ѵ�.
				
				System.out.print((char)c); //!����! int�� �о���ΰ� char�� �ٲٱ�
			}
			
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
				System.out.println("����� ����");
		}
		
	}

}
