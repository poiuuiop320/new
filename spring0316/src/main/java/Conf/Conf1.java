package Conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import Service.Doing;

@Configuration
@Import(Conf2.class)
public class Conf1 {
 @Bean
 public Doing d1(){
  return new Doing();
 }
}
