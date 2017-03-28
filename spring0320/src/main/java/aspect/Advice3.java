package aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Advice3 {
  
 /*@Pointcut("execution(* service.*.*(..))")
 public void pro(){}
 */
 
 //@Before("pro()")
 @Before("pointcut()")
 public void before(){
  System.out.println("before advice3");
 }
 //@After("within(service.Service1)")
 @After("pointcut()")
 public void after(){
  System.out.println("after advice3");
 }
 @Pointcut("execution(* service.*.*(..))")
 public void pointcut(){}
}
