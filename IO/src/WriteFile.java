import java.io.*;
public class WriteFile {

	public static void main(String[] args) {
		File f = new File(args[0]);
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new FileWriter(f));
			StringBuilder sb = new StringBuilder(256);
			String str;
			while(!(str = in.readLine()).equals("")) {
				sb.append(str).append("\n");
			}
			out.print(sb);
			in.close();out.close();
			
			
			
		} catch (IOException e) {e.printStackTrace();}
		

	}

}
