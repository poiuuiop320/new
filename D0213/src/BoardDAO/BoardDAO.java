package BoardDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BoardDTO.BoardDTO;

public class BoardDAO {

	private Connection getConnection()
	{
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="hong";
		String password="123";
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection(url, user, password);
		}
		catch(ClassNotFoundException e){System.out.println(e);}
		catch(SQLException e){System.out.println(e);}
		return conn;
	}

	public List<BoardDTO> boardView()
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		StringBuilder sb=new StringBuilder();
		ResultSet rs=null;
		sb.append(" select     ");
		sb.append("  num       ");
		sb.append("  ,title    ");
		sb.append("  ,content  ");
		sb.append("  ,writer   ");
		sb.append(" from board ");
		ArrayList<BoardDTO> arr=new ArrayList<>();




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
			if(rs!=null)try{rs.close();}catch(Exception e){}
			if(pstmt!=null)try{pstmt.close();}catch(SQLException e){}
			if(conn!=null)try{conn.close();}catch(SQLException e){}
		}
		return arr;
	}
	public int boardappend(BoardDTO data)

	{
		Connection conn=null;
		PreparedStatement pstmt=null;



		StringBuilder sql=new StringBuilder();
		sql.append(" insert into board (num,title,content,writer)  ");
		sql.append(" values (se1.nextval, ?,?,? )                  ");
		int r=0;

		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql.toString());
			pstmt.setString(1, data.getTitle());
			pstmt.setString(2, data.getContent());
			pstmt.setString(3, data.getWriter());
			r=pstmt.executeUpdate();
		}catch(SQLException e){System.out.println(e);}
		finally{
			if(pstmt!=null)try{pstmt.close();}catch(SQLException e){System.out.println(e);}
			if(conn!=null)try{conn.close();}catch(SQLException e){System.out.println(e);}

		}
		return r;
	}
	public BoardDTO readData(int id)
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		StringBuilder sql=new StringBuilder();
		ResultSet rs=null;

		sql.append(" select         ");
		sql.append("  num            ");
		sql.append("  ,title         ");
		sql.append("  ,content       ");
		sql.append("  ,writer       ");
		sql.append("   from    ");
		sql.append("    board   ");
		sql.append("  where num=?   ");



		BoardDTO dto=new BoardDTO();

		try{

			conn=getConnection();
			pstmt=conn.prepareStatement(sql.toString());
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				dto.setNum(rs.getInt("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setWriter(rs.getString("writer"));

			}
			else
			{

			}
		}catch(SQLException e){System.out.println(e);}
		finally
		{if(pstmt!=null)try{pstmt.close();}catch(SQLException e){System.out.println(e);}
		if(conn!=null)try{conn.close();}catch(SQLException e){System.out.println(e);}
		if(rs!=null)try{rs.close();}catch(SQLException e){System.out.println(e);}

		}
		return dto;
	}
	public void delData(int num)
	{
		Connection conn=null;
		PreparedStatement pstmt=null;

		StringBuilder sql=new StringBuilder();
		sql.append("   delete from board  ");
		sql.append("  where num=?   ");

		try{

			conn=getConnection();
			pstmt=conn.prepareStatement(sql.toString());
			pstmt.setInt(1, num);
			pstmt.executeUpdate();

		}catch(SQLException e){System.out.println(e);}
		finally
		{
			if(pstmt!=null)try{pstmt.close();}catch(SQLException e){System.out.println(e);}
			if(conn!=null)try{conn.close();}catch(SQLException e){System.out.println(e);}


		}


	}
	public void moditydata(BoardDTO dto)
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		StringBuilder sql=new StringBuilder();
		sql.append(" update board ");
		sql.append(" set content=? ");
        sql.append(" where num=? ");
		
		
		
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql.toString());
			
			pstmt.setInt(2,dto.getNum());
			pstmt.setString(1, dto.getContent());
			pstmt.executeUpdate();
			
		}catch(SQLException e){System.out.println(e);}
		finally
		{
			
			if(pstmt!=null)try{pstmt.close();}catch(SQLException e){System.out.println(e);}
			if(conn!=null)try{conn.close();}catch(SQLException e){System.out.println(e);}
		}
		
	}
	
}
