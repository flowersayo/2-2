
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockBinaryCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File src=new File("c:\\Temp\\apple.jpg");
		File dest = new File("c:\\Temp\\back.jpg");
		
		int c; //�о���� ����
	
		
		try {
			
			FileInputStream fr = new FileInputStream(src);
			FileOutputStream fw = new FileOutputStream(dest);
			
			byte [] buf =new byte[1024 * 10]; //10KB ����
			
			while(true) {
				int n=fr.read(buf); //���� ũ�⸸ŭ �б�. n�� ���� ���� ����Ʈ
				fw.write(buf,0,n); //buf[0] ���� n����Ʈ ����
				if(n<buf.length)
					break; //���� ũ�⺸�� �۰� ������ ������ ���ϳ��� �����Ѱ�. ���� ����
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
