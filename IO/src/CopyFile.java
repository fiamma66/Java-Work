import java.io.*;

public class CopyFile {

	public static void main(String[] args) {
		File f_r = new File(args[0]);
		File f_w = new File(args[1]);
		try {
			BufferedReader in = new BufferedReader(new FileReader(f_r));
			StringBuilder sb = new StringBuilder(256);
			String str;
			while((str=in.readLine()) != null) {
				sb.append(str).append("\n");
			}
			
			
			
			PrintWriter out = new PrintWriter(new FileWriter(f_w));
			
			
			out.print(sb);
			in.close();out.close();
		
		
		}catch (IOException e) {e.printStackTrace();}

	}

}
