import java.io.*;

public class ListDir3 {

	public static void main(String[] args) {
		File file = new File(args[0]);
		if(!(file.isDirectory())) {
			System.out.println("Not Directory !");
			System.exit(0);
		}
		StringBuilder sb = new StringBuilder(256);
		
		for(File f : file.listFiles()) //for each �ϥ�  ����listFiles�ѥ�
			sb.append((f.isFile())? "file:" : "dir:")
			   .append(f.getName()).append("\n");
		
		System.out.print(sb);
		
			
		
		

	}

}
