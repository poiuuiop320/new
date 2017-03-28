package Life;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*@Configuration*/
public class BeanLife2 implements InitializingBean,DisposableBean,BeanNameAware{
 private String name;
 
 @Override
 public void setBeanName(String name) {
  this.name=name;

  System.out.println("setBean name 1");
  
 }
 @PostConstruct
 public void conBean(){
  System.out.println("postconstructor bean call 2");
  
 }
 @Override
 public void afterPropertiesSet() throws Exception {
  System.out.println("initialize  3");

 }
/* @Bean(initMethod="init",destroyMethod="disp")
 public BeanLife2 bean1(){
  System.out.println("bean 1 call! - bean create - 4");
  return new BeanLife2();
 }*/
 public BeanLife2 (){};
 
 public void init(){
  System.out.println("init method 5");
 }
 public void prt(){
  System.out.println("prt!         6 ");
  System.out.println("BeanNameAware 7 : " + name  );
 }
 @PreDestroy
 public void desBean(){
  System.out.println("PreDestory bean call 8");
 }
 @Override
 public void destroy() throws Exception {
 System.out.println("desposable   9");
  
 }
 
 public void disp(){
  System.out.println("disp method  10");
 }
 




}
