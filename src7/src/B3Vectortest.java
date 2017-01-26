import java.util.Vector;

public class B3Vectortest {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("aaa");
		v.add("bbb");
		v.add("ccc");
		v.add("ddd");
		v.add("eeee");
		
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));//결과를 보면 같은 v참조변수에 중복값을 가져오는걸 볼 수 있다.
			
		}
		v.remove(0);//remove메서드를 이용해서 0제거
		System.out.println(v.get(0));//0번째를 확인하니 두번째가 앞으로 값이 옮겨짐
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
			
		}
		//remove는 첫번째 만나는 정보만 삭제된다.
		
	

	}

}
