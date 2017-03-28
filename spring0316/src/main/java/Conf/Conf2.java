package Conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import DTO.Person;

@Configuration
public class Conf2 {
 @Bean
 public Person p1(){
  return new Person();
 }
 @Bean
 public Person p2(){
  return new Person();
 }
}
