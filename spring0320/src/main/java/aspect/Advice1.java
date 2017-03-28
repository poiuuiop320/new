package aspect;

public class Advice1 {
 public void before(){
  System.out.println("before advice");
 }
 public void after()
 {
  System.out.println("after advice");
 }
 public void afterThrowing(Throwable e){
  System.out.println(e);
  System.out.println("afterThrowing");
 }
 public void afterReturning(){
  System.out.println("afterReturning");
 }
}
