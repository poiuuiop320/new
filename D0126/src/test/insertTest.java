package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertTest {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String classname="com.mysql.jdbc.Driver";
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/t1";
		String user="hong";
		String password="123";
		Statement stmt=null;
		
//		String sql="insert into member values ('"+id+"','"+mneme+"',20,170)";
		try {
			System.out.println("input id");
			String id=in.readLine();
			System.out.println("input name");
			String mname=in.readLine();
			System.out.println("input age");
			int age=Integer.parseInt(in.readLine());
			System.out.println("input ki");
			float ki=Float.parseFloat(in.readLine());
			StringBuilder sb=new StringBuilder();
			sb.append("insert into member ");
			sb.append("                         values ");
			sb.append("('"+id+"','"+mname+"','"+age+"',"+ki+")");
			
			
			Class.forName(classname);
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("연결완료");//insert update delete작업시작
			stmt=conn.createStatement();//변수없이 추가할 경우 정적인 쿼리문인 경우 사용한다
			int r=stmt.executeUpdate(sb.toString());
			if(r>0)
			System.out.println(r+"추가 되었습니다.");
			else
				System.out.println("추가안됨");
		}catch(IOException e){System.out.println(e);}
		catch (ClassNotFoundException e) {System.out.println(e);	}
		catch(SQLException e){System.out.println(e);}
		finally{
			if(stmt!=null)try{stmt.close();}catch(SQLException e){}
			if(conn!=null)try{conn.close();}catch(SQLException e){}
		}

	}

}
