import java.io.*;
import java.util.*;
import java.net.*;
class TcpClient2
{
	public static void main(String argv[])throws Exception
	{
		String se1;
		InetAddress ip = InetAddress.getLocalHost(); 
		Socket s = new Socket(ip,1610);
		ObjectOutputStream ot = new ObjectOutputStream(s.getOutputStream());
		ObjectInputStream st1 = new ObjectInputStream(s.getInputStream());
		System.out.println("enter the length of array"); 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("hello");
		while(sc.hasNextInt())
		{
			int in1 = sc.nextInt();
			arr.add(in1);
			if(arr.size() >= n)
			{
				break;
			}
		}
		System.out.println("list elements are"+ arr);
		ot.writeObject(arr);
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		 arr1 = (ArrayList) st1.readObject<>();
		System.out.println("values"+ arr1);
		s.close();
	}
}