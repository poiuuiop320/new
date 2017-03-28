package Fact;

public class BeanFactory {
private static BeanFactory instance= new BeanFactory();
public static BeanFactory getInstance(){return instance;}
private BeanFactory(){};

}
