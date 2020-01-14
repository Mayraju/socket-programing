import java.io.*;
import java.net.*;
import java.util.*;
class UdpServer1
{
	public static void main(String argv[])throws Exception
	{
		String str2 = " ";
		DatagramSocket ds1 = new  DatagramSocket(1602);
		byte[] rec = new byte[1024];
		DatagramPacket dp = new DatagramPacket(rec,rec.length);
		ds1.receive(dp);
		String s = new String(rec);  //To convert a byte array to String,
		                                //you can use String class constructor with byte[] as constructor argument.
		System.out.println("string is"+ s);
		int len = s.length();
		for(int i=len-1 ; i>=0 ;i--)
		{
			str2 = str2+ s.charAt(i);
		}
		System.out.println(str2);
		byte[] sen = new byte[1024];
		sen = str2.getBytes();
		InetAddress ip = InetAddress.getLocalHost(); 
		DatagramPacket dp1 = new DatagramPacket(sen,sen.length,ip,dp.getPort());
		ds1.send(dp1);
		//ds1.close();



	}
}