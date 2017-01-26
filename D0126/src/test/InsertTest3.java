package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest3 {

	public static void main(String[] args) {
		String classname="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/t1";
		String user="hong";
		String password="123";
		Statement stmt=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;//결과 set    begin of file ===자료=== end of file rs가 bof를 가리킴 
		try {
			Class.forName(classname);
			conn=DriverManager.getConnection(url, user, password);
			StringBuilder sb= new StringBuilder();
			sb.append(" select    ");
			sb.append("  mid        ");
			sb.append(" ,mname   ");
			sb.append(" ,age      ");
			sb.append(" ,ki        ");
			sb.append(" from member   ");

			pstmt=conn.prepareStatement(sb.toString());  
			rs=pstmt.executeQuery();
			System.out.println("아이디  이름 나이 키");
			while(rs.next())//next로 있는지 없는지 판단하고 자료를가져온다. 
			{
				String mid=rs.getString("mid"	);
				String mname=rs.getString(2);
				Float f=rs.getFloat("ki");
				int age=rs.getInt("age");
				System.out.printf("%s %s %d %.1f \n",mid,mname,age,f);
				//rs.getInt(columnIndex)
				//rs.getInt(columnLabel)
			}
			



		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e){
			System.out.println(e);
		}finally{
			if(rs!=null)try{rs.close();}catch(SQLException e){}
			if(pstmt!=null)try{pstmt.close();}catch(SQLException e){}
			if(conn!=null)try{conn.close();}catch(SQLException e){}
		}

	}

}
