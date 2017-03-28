package spring0315;

import java.util.Iterator;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.kic.set.BeanSet2;
import com.kic.set.MemberDTO;

public class BeanSetTest2 {
 public static void main(String[] args) {
  GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("setapp2.xml");
  BeanSet2 ins=ctx.getBean("b1",BeanSet2.class);
  Set result=ins.getS1();
  Iterator<MemberDTO> ita=result.iterator();
  while (ita.hasNext()) {
   MemberDTO dto=ita.next();
   System.out.println(dto);
  }
  ctx.close();
 }
}
