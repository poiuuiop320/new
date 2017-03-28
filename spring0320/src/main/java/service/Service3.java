package service;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Service3 {
 
 public void write(){   //around advice 시작 끝 처리
  for (int i = 0; i < 10; i++) {
   System.out.println("write : " + i);
  }
 }
 public int read(String[] arr)throws ArrayIndexOutOfBoundsException{ //exception 배열
  if(arr.length>=10){
  for (int i = 0; i < 10; i++) {
   System.out.println("read : " + arr[i]);
  }
  }
  else
   throw new ArrayIndexOutOfBoundsException();
  return arr.length;
 }
}
