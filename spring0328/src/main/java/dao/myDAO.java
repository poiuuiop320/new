package dao;

import java.util.List;

import vo.deptVO;

public interface myDAO {
 public String getDeptName(int deptno);
 public List<deptVO> getList();
 public int dataCount();
 public deptVO getData(int deptno);   
}
