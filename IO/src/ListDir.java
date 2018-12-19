import java.io.*;

public class ListDir {

	public static void main(String[] args) {
		File file = new File(args[0]);
		if(!(file.isDirectory())) {
			System.out.println("Not Directory !");
			System.exit(0);
		}
		StringBuilder str = new StringBuilder(256);
		String[] list = file.list();
		for(int i = 0; i < list.length ; i++) {
			str.append(list[i]).append("\n");
		}
		System.out.print(str);
			
		
		

	}

}
