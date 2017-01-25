
public class SwitchTest1 {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		
		*switch case 에서의 switch() 안에 변수나 식이들어갈 수 있다.
		*
		*int:byte short int char
		*
		*///int su =10;
		//byte su=10;
		//long su=10;
/*		char su='a';
switch(su){
case 'a':
	System.out.println("1입니다.");
	break;
case 'b':
	System.out.println("2입니다.");
	break;
case 'c':
	System.out.println("3입니다.");
	break;
case 'd':
	System.out.println("4입니다.");
	break;
	default:
		System.out.println("나머지 경우입니다.");
}*/
		
		String dept="a";
		
		switch(dept){//jdk7이후에 String 사용가능 byte short int char string
		case "a":
			System.out.println("기획");
			break;
		case "b":
			System.out.println("인사");
			break;
		case "c":
			System.out.println("영업");
			break;
		case "d":
			System.out.println("전산");
			default: 
				System.out.println("나머지부서");
		
			
		}
		
		
	}

}
