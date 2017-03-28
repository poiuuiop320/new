package spring0315;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeanJunitTest {

 @Before
 public void prt()
 {
  System.out.println("before");
 }
 @After
 public void prt2()
 {
  System.out.println("after");
 }
 @Test
 public void prt3()
 {
  System.out.println("test");
 }
 /*
  * @annotation 으로 사용해서 junit 을 다룬다
  * 
  */

}
