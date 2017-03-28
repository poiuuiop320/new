package vo;

public class deptVO {
 private int deptno;
 private String dname;
 private String loc;
 public int getDeptno() {
  return deptno;
 }
 public void setDeptno(int deptno) {
  this.deptno = deptno;
 }
 public String getDname() {
  return dname;
 }
 public void setDname(String dname) {
  this.dname = dname;
 }
 public String getLoc() {
  return loc;
 }
 public void setLoc(String loc) {
  this.loc = loc;
 }
 /**
  * @param deptno
  * @param dname
  * @param loc
  */
 public deptVO(int deptno, String dname, String loc) {
  this.deptno = deptno;
  this.dname = dname;
  this.loc = loc;
 }
 /**
  * 
  */
 public deptVO() {
  // TODO Auto-generated constructor stub
 }

 
}
