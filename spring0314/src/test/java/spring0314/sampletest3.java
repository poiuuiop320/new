package spring0314;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.kic.sample3.MemberDTO;
import com.kic.sample3.Person;

public class sampletest3 {
 public static void main(String[] args) {
  GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("app3.xml");
 /* Person ins=ctx.getBean("p1",Person.class);
  List<String> list=ins.getData1();
  for(int i=0;i<list.size();i++){
   System.out.println(list.get(i));
  }*/
  Person ins2=ctx.getBean("p3",Person.class);
  List<MemberDTO>list=ins2.getData2();
  for (int  j = 0; j < list.size(); j++) {
   System.out.println(list.get(j));
  }
  ctx.close();
 }
}
