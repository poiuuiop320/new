package Autowired;

public class MemberDTO {
 private String name;
 public MemberDTO (String name){
  this.name = name;
 }
 public String toString(){
  if(name==null){
   name="";
  }
  return "name:"+name;
 }
}
