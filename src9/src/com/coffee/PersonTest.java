package com.coffee;
import com.hello.*;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 ins = new Test2(); //패키지통한 상속
		ins.prt();
		/*com.hello.Dog ins2=new com.hello.Dog();
		ins2.doing();*/
		Dog ins2= new Dog();
		ins2.doing();
		Cat ins3 =new Cat();
		ins3.act();
		

	}

}
