package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		String classname="com.mysql.jdbc.Driver";
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/t1";
		String user="hong";
		String password="123";
		Statement stmt=null;
		PreparedStatement pstmt=null;
		
		try{
			Class.forName(classname);
			conn=DriverManager.getConnection(url, user, password);
			//createStatement
			//prepareStatement
			StringBuilder sql = new StringBuilder();
			sql.append("  update   ");
			sql.append("  member   ");
			sql.append("   set        ");
			sql.append("   age=?   ");
			sql.append("  where    ");
			sql.append("  mid=?   ");
			
			pstmt=conn.prepareStatement(sql.toString());
			pstmt.setInt(1, 30 );
			pstmt.setString(2, " a2 ");
			int r=pstmt.executeUpdate();
			System.out.println(r+"°³ º¯°æµÊ ");
			
			
			
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}catch(SQLException e){
			System.out.println(e);

		}finally{
			if(conn!=null)try{conn.close();}catch(SQLException e){}
		}

	}/*
	public class UpdateTest {
	public static void main(String[] args) {
		String className="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/t1";
		String user="hong";
		String pwd="123";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
		
          
		}catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}catch(SQLException e)
		{
			System.out.println(e);
		}finally{
			if(pstmt!=null) try{pstmt.close();} catch(SQLException e){}
			if(conn!=null) try{conn.close();} catch(SQLException e){}
		}
		
	}

}
*/
}
