import java.io.*;
import java.net.*;
class TcpClient{

	public static void main(String argv[]) throws Exception
	{
		String sentence;
		String modefiedsentence;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Socket client = new Socket("localhost",1500);
		DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
		BufferedReader br1 = new BufferedReader(new InputStreamReader(client.getInputStream()));
		sentence = br.readLine();
		outToServer.writeBytes(sentence+"\n");
		modefiedsentence = (String)br1.readLine();
		System.out.println("from srever"+ modefiedsentence);
		client.close();
	}
}   