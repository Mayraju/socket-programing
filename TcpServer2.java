import java.io.*;
import java.net.*;
import java.util.*;
class TcpServer2
{
	public static void main(String argv[])throws Exception
	{
		ServerSocket st4 = new ServerSocket(1610);
		while(true)
		{
			Socket s = st4.accept();
			ObjectInputStream st = new ObjectInputStream(s.getInputStream());
			ObjectOutputStream st3 = new ObjectOutputStream(s.getOutputStream());
			ArrayList al = (ArrayList)st.readObject();
			System.out.println("list elements are");
			System.out.println(al);
			Collections.sort(al);
			st3.writeObject(al);
			System.out.println("Sorted list"+ al);


		}
	}
}