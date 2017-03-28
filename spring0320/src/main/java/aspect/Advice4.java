package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class Advice4 {
 @Pointcut("execution(* service.*.*(..))")
 public void pointcut(){}
 
 
 @Around("pointcut()")
 public Object around(ProceedingJoinPoint joinpoint) throws Throwable{
 System.out.println("before advice4");
 long start = System.currentTimeMillis();
 System.out.println("시작 시간 : " + start);
 
 try{
  Object result = joinpoint.proceed();
  return result;
 }finally{
  System.out.println("after advice4");
  long end = System.currentTimeMillis();
  System.out.println("끝난 시간 : " + end);
  System.out.println("처리시간 : "+(end-start));
 }
 }
 //@AfterThrowing("pointcut()")
 @AfterThrowing(pointcut = "execution(* service.Service3.read(..))",throwing = "e")
 public void writeExcpet(Throwable e){
  System.out.println(e);
  System.out.println("writeExcept 배열 에러");
 }
 
 @AfterReturning(pointcut = "execution(* service.Service3.read(..))", returning="a")
 public void getsize(int a){
  System.out.println("크기는 : " +  a);
 }
}
