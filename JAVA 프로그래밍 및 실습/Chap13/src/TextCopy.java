import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



//�ؽ�Ʈ ���� ���� (���� ��Ʈ�� FileReader,FileWriter �̿�) 
public class TextCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File src = new File("c:\\windows\\system.ini");
		File dest = new File("c:\\Temp\\system.txt");
		
		int c; 
		
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw =new FileWriter(dest);
			
			while((c=fr.read())!=-1) { //���� �ϳ� �а�
				fw.write((char)c);  //���� �ϳ� ���� 
				System.out.println("*");
			}
			
			fr.close();
			fw.close(); //��Ʈ���ݴ°� ��������!!!!!
			System.out.println(src.getPath() +"->"+dest.getPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("����� ����");
		}
		
		
		
		
	}

}
