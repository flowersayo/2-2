import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File src=new File("c:\\Temp\\apple.jpg");
		File dest = new File("c:\\Temp\\back.jpg");
		
		int c; //�о���� ����
	
		
		try {
			
			FileInputStream fr = new FileInputStream(src);
			FileOutputStream fw = new FileOutputStream(dest);
			
			while((c=fr.read())!=-1) {
				fw.write((byte)c); //byte�� ����ȯ
				
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath()+"->"+dest.getPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ���� ����");
		}
	}

}
