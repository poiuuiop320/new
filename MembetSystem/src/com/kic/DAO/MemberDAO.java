package com.kic.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.kic.VO.MemberVO;


public class MemberDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	public  void getConnection()
	{
		String classname="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/t1";
		String user="hong";
		String pwd="123";
		try {
			Class.forName(classname);
			conn=DriverManager.getConnection(url,user,pwd);

		} catch (ClassNotFoundException e) {	}
		catch(SQLException e){}
	}
	public Vector<Vector<Comparable>> showAll()
	{
	getConnection();
	
	StringBuilder sb= new StringBuilder();
	
	sb.append(" select  ");
	sb.append("   mid     ");
	sb.append("    ,mname   ");
	sb.append("     ,age     ");
	sb.append("       ,ki     ");
	sb.append(" from member     ");

	Vector<Vector<Comparable>> arr= new Vector<Vector<Comparable>>();
	try {
		pstmt = conn.prepareStatement(sb.toString());
		rs=pstmt.executeQuery();//select ��    ddm creat alter drop
		
		while(rs.next())
		{
			Vector<Comparable> dto=new Vector<Comparable>();
			dto.add(rs.getString("mid"));
			dto.add(rs.getString("mname"));
			dto.add(rs.getInt("age"));
			dto.add(rs.getFloat("ki"));
			arr.add(dto);
			/*MemberVO dto=new MemberVO();
			dto.setMid(rs.getString("mid"));
			dto.setMname(rs.getString("mname"));
			dto.setAge(rs.getInt("age"));
			dto.setKi(rs.getFloat("ki"));
			arr.add(dto);*/
		}
		
		System.out.println(rs);
	} catch (SQLException e) {}	
		
	finally{
		if(rs!=null)try{rs.close();}catch(SQLException e){}
		if(pstmt!=null)try{pstmt.close();}catch(SQLException e){}
		if(conn!=null)try{conn.close();}catch(SQLException e){}
	}
	return arr;
	
}
}
/*select �÷���, �÷���
from  ���̺��̸�
where ����

insert into ���̺� �̸� values
���� '    ' 
            ���̺� �̸�(�÷�1,�÷�2) values(��1,��2)


delete
from ���̺��̸�
where ����


update
from ���̺��̸�
set
    �÷���1=��1
  , �÷���2=��2

where ����		

mysql -u hong -p t1

show tables;

desc member;


update member
set
mname='������'
,age=22
,ki=160
where mid='a2';




*/