package spring0316;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Conf.mainConf;
import DTO.Person;
import Service.Doing;

public class SampleTest2 {

 public static void main(String[] args) {
  
//  AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Conf1.class,Conf2.class);//class name 을 써준다
  AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(mainConf.class);
  Person p1=app.getBean("p1",Person.class);
  Person p2=app.getBean("p2",Person.class);
  Doing d1=app.getBean("d1",Doing.class);
  p1.getAge();
  p2.getAge();
  d1.prt();
  d1.show();
  d1.view();
app.close();
 }

}
