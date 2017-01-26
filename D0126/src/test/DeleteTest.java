package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {
		String classname="com.mysql.jdbc.Driver";
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/t1";
		String user="hong";
		String password="123";
		Statement stmt=null;
		PreparedStatement pstmt=null;
		
		try {
			
			Class.forName(classname);
			conn=DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false);
			
			StringBuilder sql=new StringBuilder();
			
			
			sql.append("delete ");
			sql.append("from member ");
			sql.append("where mid=? ");
			pstmt=conn.prepareStatement(sql.toString());
			pstmt.setString(1, "a1");
			int r=pstmt.executeUpdate();
			System.out.println(r+" 삭제 완료");
			conn.commit();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e){
			System.out.println(e);
			
			
		}finally{
			if(pstmt!=null)try{pstmt.close();}catch(SQLException e){System.out.println(e);
		if(conn!=null)try{conn.close();}catch(SQLException e1){System.out.println(e1);};
		}
		

	}

}
}

