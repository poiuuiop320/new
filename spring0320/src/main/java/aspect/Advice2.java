package aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advice2 {
 public Object around(ProceedingJoinPoint joinpoint)throws Throwable{
  
  System.out.println("before");
  long start = System.currentTimeMillis();
  System.out.println(start);
  
  try {
   Object result = joinpoint.proceed();
   return result;
  } finally{
   System.out.println("after");
   long end = System.currentTimeMillis();
   System.out.println("처리시간...."+(end-start));
  }
 }
}
