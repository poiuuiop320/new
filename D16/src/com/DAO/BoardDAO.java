package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DTO.BoardDTO;

public class BoardDAO {
	public List<BoardDTO> boardView()
	{
		Connection conn=null;
		PreparedStatement pstmt=null;

		StringBuilder sb=new StringBuilder();
		sb.append(" select  ");
		sb.append("  num  ");
		sb.append("   ,title  ");
		sb.append("  ,content ");
		sb.append("  ,writer  ");
		sb.append("  from board ");

		ResultSet rs=null;

		ArrayList<BoardDTO> arr= new ArrayList<>();

		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sb.toString());
			rs=pstmt.executeQuery();

			while(rs.next())
			{
				BoardDTO dto=new BoardDTO();
				dto.setNum(rs.getInt("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setWriter(rs.getString("writer"));
				arr.add(dto);
			}


		}catch(SQLException e){System.out.println(e);}
		finally
		{
			if(rs!=null)try{rs.close();}catch(Exception e){System.out.println(e);}
			if(pstmt!=null)try{pstmt.close();}catch(SQLException e){System.out.println(e);}
			if(conn!=null)try{conn.close();}catch(SQLException e){System.out.println(e);}
		}
		return arr;
	}
	private Connection getConnection()
	{
		Connection conn=null;
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="hong";
		String password="123";
		try{
			Class.forName("oracle.jdbs.OracleDriver");
			conn=DriverManager.getConnection(url, user, password);
		}catch(SQLException e){System.out.println(e);}
		catch(ClassNotFoundException e){System.out.println(e);}
		return conn;	
	}
}
