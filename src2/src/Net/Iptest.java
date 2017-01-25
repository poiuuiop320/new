package Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Iptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress ip =null;
		InetAddress[] ips=null;

		try {
			ip=InetAddress.getByName("www.naver.com");
			String addr=ip.getHostAddress();
			String hostname=ip.getHostName();
			System.out.println(addr);
			System.out.println(hostname);
			System.out.println(ip);
			ips=InetAddress.getAllByName("www.naver.com");
			for (int i = 0; i < ips.length; i++) {
				System.out.println(ips[i]);
				
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
