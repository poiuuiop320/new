package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import vo.deptVO;
@Repository
public class MyDAOImple implements myDAO {
 @Autowired
 private JdbcTemplate temp;

 @Override
 public int dataCount() {
  // TODO Auto-generated method stub
  String sql="select count(*) from depttmp ";
  int result=temp.queryForInt(sql);

  return result;
 }

 @Override
 public String getDeptName(int deptno) {
  // TODO Auto-generated method stub
  String sql="select dname from depttmp where deptno=?";
  String result=temp.queryForObject(sql, String.class, deptno);
  return result;
 }
 /*
 @Override
 public ArrayList<deptVO> getData() {
  // TODO Auto-generated method stub
  return null;
 }

  */

 @Override
 public deptVO getData(int deptno) {
  // TODO Auto-generated method stub
  String sql="select deptno, dname,loc from depttmp where deptno=?"; 

  deptVO result= temp.queryForObject(sql,new RowMapper<deptVO>() {

   @Override
   public deptVO mapRow(ResultSet rs, int arg1) throws SQLException {
    // TODO Auto-generated method stub
    deptVO data=new deptVO();
    data.setDeptno(rs.getInt("deptno"));
    data.setDname(rs.getString("dname"));
    data.setLoc(rs.getString("loc"));
    return data;
   }
  },deptno);
  return result;
 }

 @Override
 public List<deptVO> getList() {
  String sql = "select * from depttmp ";
  List<deptVO> list = temp.query(sql, new RowMapper<deptVO>(){
   @Override
   public deptVO mapRow(ResultSet rs, int arg1) throws SQLException {
    deptVO data = new deptVO();
    data.setDeptno(rs.getInt("deptno"));
    data.setDname(rs.getString("dname"));
    data.setLoc(rs.getString("loc"));
    return data;}
   }); 
  
  return list;
 }


}