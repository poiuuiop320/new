
public class SwitchTest1 {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		
		*switch case ������ switch() �ȿ� ������ ���̵� �� �ִ�.
		*
		*int:byte short int char
		*
		*///int su =10;
		//byte su=10;
		//long su=10;
/*		char su='a';
switch(su){
case 'a':
	System.out.println("1�Դϴ�.");
	break;
case 'b':
	System.out.println("2�Դϴ�.");
	break;
case 'c':
	System.out.println("3�Դϴ�.");
	break;
case 'd':
	System.out.println("4�Դϴ�.");
	break;
	default:
		System.out.println("������ ����Դϴ�.");
}*/
		
		String dept="a";
		
		switch(dept){//jdk7���Ŀ� String ��밡�� byte short int char string
		case "a":
			System.out.println("��ȹ");
			break;
		case "b":
			System.out.println("�λ�");
			break;
		case "c":
			System.out.println("����");
			break;
		case "d":
			System.out.println("����");
			default: 
				System.out.println("�������μ�");
		
			
		}
		
		
	}

}
