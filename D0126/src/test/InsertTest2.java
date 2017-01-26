package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest2 {

	public static void main(String[] args) 
	{
		
		String classname="com.mysql.jdbc.Driver";
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/t1";
		String user="hong";
		String pwd="123";
		PreparedStatement pstmt=null;
		String mid="x1";
		String mname="asdf";
		int age=22;
		float ki=180;
		try {
			Class.forName(classname);
			conn=DriverManager.getConnection(url, user, pwd);
			StringBuilder sql=new StringBuilder();
			sql.append("insert into member ");//띄어쓰기
			sql.append("values ");
			sql.append("(?,?,?,?);");
			pstmt=conn.prepareStatement(sql.toString());
			pstmt.setString(1, mid);
			pstmt.setString(2, mname);
			pstmt.setInt(3, age);
			pstmt.setFloat(4, ki);
			int r=pstmt.executeUpdate();
			System.out.println(r+"추가");
			
		} catch (ClassNotFoundException e) {	System.out.println(e);	}
		catch(SQLException e){System.out.println(e);}
		finally
		{
			if(pstmt!=null)try{pstmt.close();}catch(SQLException e){System.out.println(e);
			if(conn!=null)try{conn.close();}catch(SQLException e1){System.out.println(e1);}
			}
		}
	}

}/*
컬럼,필드

table

튜플(tuple),레코드(record),row

delete

select mid,name,age,ki 보고싶은멤버
from member
where mid='a1';
where age>=20;
All or nothing 
commit
rollback

*/