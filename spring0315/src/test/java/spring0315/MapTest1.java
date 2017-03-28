package spring0315;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kic.map.Map1;

public class MapTest1 {
 Map1 ins;
 @Before
 public void setup(){
  GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("mapaap.xml");
  ins = ctx.getBean("m1",Map1.class);
  ctx.close();
 }
 @Test
 public void test(){
  
  /*Assert.assertEquals(expecteds, actuals);*/
  
  assertEquals("111",ins.getM1().get("a1"));
  
 }
 @Test
 public void test2(){
  assertEquals(new Integer(222), ins.getM1().get("a2"));
 }
}
