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
		Socket s=null;//���� �д°� ���°� �ΰ�
		BufferedReader br=null;
		PrintWriter pw=null;
		try {
			server=new ServerSocket(5000);//new��������
			System.out.println("������ ����");
			s=server.accept();//���
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));//����
			pw=new PrintWriter(s.getOutputStream());
			pw.println("���� ���ӿϷ�");
			pw.flush();
			String msg=br.readLine();
			System.out.println(msg);



		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}finally
		{
			if(s!=null)try{s.close();}catch(IOException e){System.out.println(e);}
			if(server!=null)try{server.close();}catch(IOException e){System.out.println(e);//������ �ȴݴ´�.
			if(pw!=null)pw.close();


			}
		}

	}

}
