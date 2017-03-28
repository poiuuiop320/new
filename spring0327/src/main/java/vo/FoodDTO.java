package vo;

public class FoodDTO {
 private String fcode;
 private String fname;
 /**
  * 
  */
 public FoodDTO() {
  // TODO Auto-generated constructor stub
 }
 /**
  * @param fcode
  * @param fname
  */
 public FoodDTO(String fcode, String fname) {
  this.fcode = fcode;
  this.fname = fname;
 }
 public String getFcode() {
  return fcode;
 }
 public void setFcode(String fcode) {
  this.fcode = fcode;
 }
 public String getFname() {
  return fname;
 }
 public void setFname(String fname) {
  this.fname = fname;
 }
}
