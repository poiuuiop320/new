package Config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Configuration
@Component("conf1")
@PropertySource("classpath:db.properties")
public class Conf1 {

 @Autowired
  private Environment env;
  
  public Environment getEnv() {
   return env;
  }

  public void setEnv(Environment env) {
   this.env = env;
  } 

              

}
