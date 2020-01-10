import java.io.*;
import java.net.*;
import java.util.*;

class Server1{
	public static void main(String argv[])throws Exception
	{
		String str1;
		String str2 = " ";
		ServerSocket st = new ServerSocket(1500);
		while(true)
		{
			Socket server = st.accept();
			//st1.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			OutputStream  out = server.getOutputStream();
			DataOutputStream outToClient = new DataOutputStream(out);
			str1 = (String) br.readLine();
			System.out.println(str1);
			int len = str1.length();
			for(int i = len-1; i >= 0 ; i--)
			{
				str2 = str2+ str1.charAt(i);
			}
			outToClient.writeBytes(str2 + "\n");
			System.out.println(str2);

		}
	}
}