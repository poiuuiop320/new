package Scope;

import java.util.Iterator;
import java.util.List;

public class MemberList {
 private List<Member> list;

 public List<Member> getList() {
  return list;
 }

 public void setList(List<Member> list) {
  this.list = list;
 }
 
 public void prt()
 {
  System.out.println(list);
  Iterator<Member> ita=list.iterator();
  while (ita.hasNext()) {
   System.out.println(ita.next());
   
  }
 }
}
