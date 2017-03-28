package spring0315;

import java.util.Iterator;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.kic.set.BeanSet;

public class BeanSetTest {
 public static void main(String[] args) {
  GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("setapp.xml");
  BeanSet s1=ctx.getBean("s1",BeanSet.class);
  Set result = s1.getS1();
  Iterator ita= result.iterator();
  while (ita.hasNext()) {
   System.out.println(ita.next());//중복을 지움
  }
  ctx.close();
 }
 
}
/*
*/