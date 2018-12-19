import java.io.*;

public class CopyFile2 {

	public static void main(String[] args) {
		//��² �����ϥ�file �ѥ�
		try {
			BufferedReader in = new BufferedReader(new FileReader(args[0]));
			StringBuilder sb = new StringBuilder(256);
			String str;
			while ((str = in.readLine()) != null) {
				sb.append(str).append("\n");
			}

			PrintWriter out = new PrintWriter(new FileWriter(args[1]));

			out.print(sb);
			in.close();
			out.close();
			
		
		
		}catch (IOException e) {e.printStackTrace();}

	}

}
