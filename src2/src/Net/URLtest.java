package Net;

import java.net.MalformedURLException;
import java.net.URL;

public class URLtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL u=null;
try {
	u=new URL("http://www.google.com");
	String host =u.getHost();
	int port=u.getPort();
	String path=u.getPath();
	String ui=u.getUserInfo();
	int df=u.getDefaultPort();
	
	System.out.println(host);//www.naver.com
	System.out.println(port);//-1
	System.out.println(path);
	System.out.println(ui);//null
	System.out.println(df);//80

} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	System.out.println(e);
}
	}

}
