import java.io.*;
import java.net.*;
import java.util.*;
class UdpClient1
{
	public static void main(String argv[])throws Exception
	{
		
		DatagramSocket ds = new DatagramSocket();
		 InetAddress ip = InetAddress.getLocalHost(); 
		byte[] buf = new byte[1024];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String sen = br.readLine();
          buf = sen.getBytes();
		DatagramPacket dp = new DatagramPacket(buf,buf.length,ip,1602);
         ds.send(dp);
         System.out.println("receiveing data");
         //DatagramSocket ds4 = new DatagramSocket(1602);
         byte[] rec1 = new byte[1024];
         DatagramPacket dp2 = new DatagramPacket(rec1,rec1.length);
         ds.receive(dp2);
         String sen1 = new String(rec1);
         System.out.println(sen1);
         ds.close();


	}
}