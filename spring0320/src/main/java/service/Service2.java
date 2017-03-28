package service;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Service2 {
 public void read()
 {
  System.out.println("read");
 }
 public void write()
 {
  System.out.println("write");
 }
 public void view()
 {
  System.out.println("service2-view");
 }
}
