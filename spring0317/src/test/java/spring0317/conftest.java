package spring0317;


import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.Environment;

import Config.Conf1;

public class conftest {
public static void main(String[] args) {
 GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("confapp.xml");
 Conf1 ins=ctx.getBean("conf1", Conf1.class);
 Environment env= ins.getEnv();
 System.out.println(env.getProperty("db.driver"));
 System.out.println(env.getProperty("db.url"));
 System.out.println(env.getProperty("db.user"));
 System.out.println(env.getProperty("db.password"));
 ctx.close();
}
}
