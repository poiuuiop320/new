package com.kic.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.kic.VO.BoardVO;

public class BoardDAO
{
 private Connection getConnection()

 {
  Connection conn=null;


  try{
   InitialContext initialcontext=new InitialContext();
   Context context= (Context)initialcontext.lookup("java:/comp/env");
   DataSource datasource = (DataSource)context.lookup("jdbc/kic");
   conn=datasource.getConnection();

  }catch(NamingException e){System.out.println(e.getMessage());}
  catch(SQLException e){System.out.println(e.getMessage());}
  return conn;
 }


 private static BoardDAO instance=new BoardDAO();
 private BoardDAO (){};
 public static BoardDAO getDAO()
 {
  // TODO Auto-generated method stub
  return instance;
 }
 public List<BoardVO> getData(int startrow,int endrow,String search,String searchtext)
 {
  Connection conn=null;
  PreparedStatement pstmt=null;
  ResultSet rs=null;
  List<BoardVO> arr=new ArrayList<>();
  try{
   conn=getConnection();
   StringBuilder sql=new StringBuilder();
   sql.append("  select *                       ");
   sql.append("  from (                         ");
   sql.append("        select rownum as rnum, b.* ");
   sql.append("        from (                   ");//서브쿼리로 잡는다
   sql.append("             select              ");
   sql.append("                    num          ");
   sql.append("                    ,title       ");
   sql.append("                    ,content     ");
   sql.append("                    ,writer      ");
   sql.append("                    ,writedate   ");
   sql.append("                    ,readno      ");
   sql.append("              from               ");
   sql.append("                   board2        ");
   if(searchtext==null || search==null || searchtext.equals("")  || search.equals(""))
   {}
   else if(search.equals("num"))
    sql.append("             where num=?                        ");
   else if(search.equals("title"))
    sql.append("            where   title like '%'|| ? || '%'   ");  
   else if(search.equals("content"))
    sql.append("            where   content like '%'|| ? || '%' ");
   else if(search.equals("writer"))
    sql.append("            where   writer like '%'|| ? || '%'   ");
   sql.append("             order by num desc   ");
   sql.append("             ) b                 ");
   sql.append("        where rownum <=?         ");
   sql.append("       )                         ");
   sql.append("  where rnum >=?                 ");
   
  
   
   pstmt=conn.prepareStatement(sql.toString());
   pstmt.setInt(1, endrow);
   pstmt.setInt(2, startrow);

   if(search==null || searchtext==null || searchtext.equals("") || search.equals("")  )
   {
    pstmt.setInt(1, endrow);
    pstmt.setInt(2, startrow);
    
   }
   else if(search.equals("num"))
  { 
   pstmt.setInt(1, Integer.parseInt(searchtext));
   pstmt.setInt(2, endrow);
   pstmt.setInt(3, startrow);
    
  }
  else if(search.equals("title") || 
         search.equals("content")|| search.equals("writer"))
        {
    pstmt.setString(1, searchtext);
   pstmt.setInt(2, endrow);
   pstmt.setInt(3, startrow);
   
        } 
   
   
   rs=pstmt.executeQuery();
   while(rs.next())
   {
    BoardVO data=new BoardVO();

    data.setNum(rs.getInt("num"));
    data.setTitle(rs.getString("title"));
    data.setWriter(rs.getString("writer"));
    data.setWritedate(rs.getDate("writedate"));
    data.setReadno(rs.getInt("readno"));
    arr.add(data);
   }
  }catch(SQLException e){System.out.println(e);}
  finally{
   if(pstmt!=null)try{pstmt.close();}catch(SQLException e){System.out.println(e);}
   if(rs!=null)try{rs.close();}catch(SQLException e){System.out.println(e);}
   if(conn!=null)try{conn.close();}catch(SQLException e){System.out.println(e);}
  }
  return arr;

 }
 public int getCount()
 {
  Connection conn=getConnection(); 
  PreparedStatement pstmt =null;
  ResultSet rs=null;
  StringBuilder sql=new StringBuilder();
  sql.append(" select count(*) ");
  sql.append(" from board2 ");
  int totalcount=0;

  try{
   pstmt=conn.prepareStatement(sql.toString());
   rs=pstmt.executeQuery();
   if(rs.next())
   {
    totalcount=rs.getInt(1);
   }
  }catch(SQLException e){System.out.println(e);}

  finally{
   if(rs!=null)try{rs.close();}catch(SQLException e){}
   if(pstmt!=null)try{pstmt.close();}catch(SQLException e){}
   if(conn!=null)try{conn.close();}catch(SQLException e){}
  } 
  return totalcount;
 }
 public void readCountUpdate(int num)
 { 
  Connection conn=null;
  PreparedStatement pstmt=null;
  StringBuilder sql=new StringBuilder();
  sql.append(" update                      ");
  sql.append("       board2                ");
  sql.append("  set                        ");
  sql.append("       readno=nvl(readno,0)+1 ");
  sql.append("  where                      ");
  sql.append("       num=?                  ");

  try{
   conn=getConnection();
   pstmt=conn.prepareStatement(sql.toString());
   pstmt.setInt(1, num);
   pstmt.executeUpdate();

  }catch(SQLException e)
  {}
  finally{
   if(pstmt!=null)try{pstmt.close();}catch(SQLException e){}
   if(conn!=null)try{conn.close();}catch(SQLException e){}
  }

 }
 public BoardVO readData(int id) {
  // TODO Auto-generated method stub
  Connection conn=null;
  PreparedStatement pstmt=null;
  ResultSet rs=null;
  BoardVO vo=new BoardVO();
  try{
   conn=getConnection();
   StringBuilder sql = new StringBuilder();
   sql.append(" select      ");
   sql.append(" num        ");
   sql.append(" ,title      ");
   sql.append(" ,content    ");
   sql.append(" ,writer     ");
   sql.append(" ,writedate   ");
   sql.append(" ,readno      ");
   sql.append(" from board2  ");
   sql.append(" where num=? ");
   pstmt=conn.prepareStatement(sql.toString()); 
   pstmt.setInt(1, id);
   rs=pstmt.executeQuery();

   if(rs.next())
   {
    vo.setNum(rs.getInt("num"));
    vo.setTitle(rs.getString("title"));
    vo.setContent(rs.getString("content"));
    vo.setWriter(rs.getString("writer"));
    vo.setWritedate(rs.getDate("writedate"));
    vo.setReadno(rs.getInt("readno"));

   }

  }catch(SQLException e){System.out.println(e.getMessage());}
  finally{
   if(rs!=null)try{rs.close();}catch(SQLException e){}
   if(pstmt!=null)try{pstmt.close();}catch(SQLException e){}
   if(conn!=null)try{conn.close();}catch(SQLException e){}
  }
  return vo;
 }
 public int addData(BoardVO data)
 {
  Connection conn=null;
  PreparedStatement pstmt=null;
  int result=0;
  try{
   conn=getConnection();
   StringBuilder sql=new StringBuilder();
   sql.append("   insert   into  board2(                  ");
   sql.append("                        num               ");
   sql.append("                        ,title            ");
   sql.append("                       ,content           ");
   sql.append("                       ,writer            ");
   sql.append("                       ,writedate         ");
   sql.append("                       ,readno             ");
   sql.append("                       )                  ");
   sql.append(" values  (se1.nextval, ?,?,?,sysdate,0 )  ");

   pstmt=conn.prepareStatement(sql.toString());
   pstmt.setString(1, data.getTitle());
   pstmt.setString(2, data.getContent());
   pstmt.setString(3, data.getWriter());

   result=pstmt.executeUpdate();
  }catch(SQLException e)
  {
   System.out.println(e);
  } finally{
   if(pstmt!=null) try{ pstmt.close();} catch(SQLException e){}
   if(conn!=null) try{ conn.close();} catch(SQLException e){}

  }
  return result;
 }
 public void modifyData(BoardVO data)
 {
  Connection conn=null;
  PreparedStatement pstmt=null;
  StringBuilder sql=new StringBuilder();

  try{
   conn=getConnection();
   sql.append(" update board2 ");
   sql.append(" set          ");
   sql.append("  title=?     ");
   sql.append("  ,content=?  ");
   sql.append(" where        ");
   sql.append("   num=?      ");
   pstmt=conn.prepareStatement(sql.toString());

   pstmt.setString(1, data.getTitle());
   pstmt.setString(2, data.getContent());
   pstmt.setInt(3, data.getNum());
   pstmt.executeUpdate();
  }catch(SQLException e){
  }finally{
   if(pstmt!=null)try{pstmt.close();}catch(SQLException e){}
   if(conn!=null)try{conn.close();}catch(SQLException e){}
  }

 }
 public void deleteData(int id)
 {
  Connection conn=null;
  PreparedStatement pstmt=null;
  try{
   conn=getConnection();
   StringBuilder sql=new StringBuilder();
   sql.append(" delete from board2 ");
   sql.append(" where num=? ");

   pstmt=conn.prepareStatement(sql.toString());
   pstmt.setInt(1, id);
   pstmt.executeUpdate();
  }catch(SQLException e){System.out.println(e);}
  finally{
   if(pstmt!=null)try{pstmt.close();}catch(SQLException e){}
   if(conn!=null)try{conn.close();}catch(SQLException e){}
  }

 }
 public int searchData(String search,String searchtext)
 {
  int result=0;
  Connection conn=null;
  PreparedStatement pstmt=null;
  ResultSet rs=null;
  try{
   conn=getConnection();
   StringBuilder sb=new StringBuilder();
   sb.append("   select    count(*)      ");
   sb.append("   from board              ");

   if(search==null || searchtext==null || search.equals("") ||  searchtext.equals(""))
    pstmt=conn.prepareStatement(sb.toString());
   else if(search.equals("num") )
   {
    sb.append( "    where  num=?            ");
    pstmt=conn.prepareStatement(sb.toString()); 
    pstmt.setInt(1, Integer.parseInt(searchtext));

   }
   else if(search.equals("title"))
   {
    sb.append("   where  title  like  ?        ");     
    pstmt=conn.prepareStatement(sb.toString()); 
    pstmt.setString(1, "%"+searchtext+"%");
   }
   else if(search.equals("content"))
   {
    sb.append("   where content  like ?        ");
    pstmt=conn.prepareStatement(sb.toString());
    pstmt.setString(1, "%"+searchtext+"%");
   }
   else if(search.equals("writer")) 
   {
    sb.append("   where writer  like ?        ");
    pstmt=conn.prepareStatement(sb.toString());
    pstmt.setString(1, "%"+searchtext+"%");
   }
   rs=pstmt.executeQuery();
   if(rs.next())
   {
    result=rs.getInt(1);
   }

  } catch(SQLException e)
  {
   System.out.println(e.getMessage());  
  }catch(NumberFormatException e)
  {
   System.out.println(e);
  }
  finally{
   if(rs!=null) try{ rs.close();} catch(SQLException e){}
   if(pstmt!=null) try{ pstmt.close();} catch(SQLException e){}
   if(conn!=null) try{ conn.close();} catch(SQLException e){}
  }  //finally
  return result;


 }

}
