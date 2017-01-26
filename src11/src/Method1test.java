class Method2
{
	void painting(int age,float c2,String name){//painting 안 변수이다.어떤값인지 알기 쉽게 이름을 같게한다.
		                                                           //지역변수임 painting끝나면 사라진다.
		              //c1 c2 name 이것들은 매개변수이고 arguments라고도함
		System.out.println("그립니다.");
		System.out.println(age+c2+name);
		
	}
	/*Sting tot(int c1,int c2, int c3){
		return c1+c2+c3+"입니다.";
	}*/
	int tot(int c1,int c2, int c3){
		if(c1>10)//
			return c1+c2+c3;
		else 
			return c1;
	}
	/*int tot(int c1,int c2, int c3){
		if(c1>10)//
			return c1+c2+c3;
		                //else가 생략된것
			return c1;
	}*/
}
public class Method1test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method2 ins = new Method2();
int age=10;
float jumsu=10.2f;
String name="hong";
//ins.painting(10,10.2f,"hondgildong");//넘겨줄때 값을넣어도 되고 변수로 넣어도 된다.
ins.painting(age, jumsu, name);//위에 변수를 설정해야 한다.
ins.tot(80,89,90);
	}

}
