import java.util.LinkedList;

public class B7StackTest {

	public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<>();
	list.push("kong");
	list.push("kim");
	list.push("kim");
	
	String data=list.pop();//���ñ��� �̿��ؼ� 
	System.out.println(data);
	System.out.println(list.size());

	}

}
