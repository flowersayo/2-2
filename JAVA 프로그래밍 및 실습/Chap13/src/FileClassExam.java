import java.io.File;

public class FileClassExam {
//FileŬ������ Ȱ���� ���ϰ���
	
	public static void listDirectory(File dir) {
		
		System.out.println(dir.getPath()+ "�� ���긮��Ʈ �Դϴ�.");
		
		File[] subFiles =dir.listFiles(); //���͸� ���� ���ϰ� ���� ���͸� ����Ʈ�� File[]�迭�� ����.
		
		for(int i=0;i<subFiles.length;i++) {
			File f=subFiles[i];
			long t =f.lastModified(); //������ �����ð�
			System.out.println(f.getName()); //���ϸ�
			System.out.println(f.getPath());
			System.out.println(f.getParent()); //�θ� ���丮
			System.out.println(f.lastModified());
			System.out.println(f.length()); //���� ũ��
			System.out.println("-------------------------------------");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f1 =new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath()+", "+f1.getParent()+" , "+f1.getName());
		
		String res = "";
		
		if(f1.isFile())
			res="����";
		else if(f1.isDirectory())
			res="���͸�";
		
		System.out.println("f1�� "+res +"�Դϴ�.");
		
		File f2=new File("c:\\Temp\\java_sample");
		
		if(f1.exists()) {
			f2.mkdir(); //f2����.
		}
		
		listDirectory(new File("c:\\Temp")); //java_sample ������
		
		f2.renameTo(new File("c:\\Temp\\javasample"));
		
		listDirectory(new File("c:\\Temp")); //java_sample ->javasample ��Ī ������
		
	}

}
