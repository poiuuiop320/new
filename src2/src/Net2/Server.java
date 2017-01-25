package Net2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ServerSocket server= null;
		Socket s=null;//소켓 읽는거 쓰는거 두개
		BufferedReader br=null;
		PrintWriter pw=null;
		try {
			server=new ServerSocket(5000);//new서버소켓
			System.out.println("서버가 동작");
			s=server.accept();//대기
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));//읽음
			pw=new PrintWriter(s.getOutputStream());
			pw.println("서버 접속완료");
			pw.flush();
			String msg=br.readLine();
			System.out.println(msg);



		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}finally
		{
			if(s!=null)try{s.close();}catch(IOException e){System.out.println(e);}
			if(server!=null)try{server.close();}catch(IOException e){System.out.println(e);//서버는 안닫는다.
			if(pw!=null)pw.close();


			}
		}

	}

}
