package spring0315;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import Injection.ClientFactory;
import Scope.Member;

@RunWith(SpringJUnit4ClassRunner.class)
//@Configuration("classpath:Injection/ClientFactory.xml")
@ContextConfiguration("classpath=Injection/ClientFactoryapp.xml")
public class TestMethod {
 @Autowired
 private ClientFactory factory;
 @Test
 public void prt(){
  Member m= factory.getInstance();
  System.out.println(m);
 }
}
