package Conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Conf1.class,Conf2.class})//클래스를 import
//@ImportResource(value="main3.xml")
public class mainConf {

}
