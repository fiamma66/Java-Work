import java.io.*;

public class ListDir2 {

	public static void main(String[] args) {
		File file = new File(args[0]);
		if(!(file.isDirectory())) {
			System.out.println("Not Directory !");
			System.exit(0);
		}
		StringBuilder str = new StringBuilder(256);
	/*	String[] list = file.list();
		for(int i = 0; i < list.length ; i++) {
			str.append(list[i]).append("\n");
		}*/
		File[] list1 = file.listFiles();
		
	/*	for(int i = 0; i < list1.length; i++) {
			if(list1[i].isDirectory()) {
				str.append("dir : ").append(list1[i].getName()).append("\n");
			}else if(list1[i].isFile()) {
				str.append("file : ").append(list1[i].getName()).append("\n");
			}else {
				str.append(list1[i].getName()).append("\n");
			}
				
			
		}*/
	/*	for(int i = 0;i<list1.length;i++) { //三元運算子
			str.append((list1[i].isFile())? "file:" : "dir:")
			   .append(list1[i].getName()).append("\n");
			
		}*/
		
		for(File f : list1) //for each 使用
			str.append((f.isFile())? "file:" : "dir:")
			   .append(f.getName()).append("\n");
		
		System.out.print(str);
		
			
		
		

	}

}
