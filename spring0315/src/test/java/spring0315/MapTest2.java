package spring0315;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kic.map.Map2;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mapapp2.xml")
public class MapTest2 {
 @Autowired
  Map2 ins;
  
  @Before
  public void before()
  {
   GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("mapapp2.xml");
   ins=ctx.getBean("m2",Map2.class);
   ctx.close();
  }
  /*@before 위에 contextConfiguration묶은걸로 before가 없어도 된다. */
  @Test
  public void test(){
   assertEquals("park",ins.getM2().get("p1").getName());
  }
}
