import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A5Studenttest {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		A5StudentService service=new A5StudentService(new ArrayList<A5StudentVO>());//
		String stcode;

		while(true)
		{
			System.out.println("1.입력");
			System.out.println("2.삭제");
			System.out.println("3.조회");
			System.out.println("4.수정");
			System.out.println("5.전체보기");
			System.out.println("6.종료");
			System.out.println("선택?");
			String yn=in.readLine();

			switch(yn)//
			{
			case"1":
				A5StudentVO vo=new A5StudentVO();//vo라는 객체 생성
				System.out.println("학번 입력");
				vo.setStcode(in.readLine());
				System.out.println("학과");
				vo.setDept(in.readLine());
				System.out.println("이름");
				vo.setName(in.readLine());
				System.out.println("나이");
				vo.setAge(Integer.parseInt(in.readLine()));
				boolean result=service.add(vo);//vo객체를 닮고 리턴 받은 값을 result에
				if(result)//
					System.out.println("추가성공!!");
				else
					System.out.println("실패");
				break;
			case"2":
				System.out.println("삭제할 학번");
				stcode=in.readLine();
				boolean r= service.remove(stcode);
				if(r)
					System.out.println("삭제");
				else 
					System.out.println("삭제실패");


			case"3":
				System.out.println("조회할 학번");
				stcode=in.readLine();//
				A5StudentVO data=service.search(stcode);//
				if(data==null)
				{
					System.out.println("자료없음");

				}
				else
				{
					System.out.println(data);//
				}
				break;
			case"4":
				data=new A5StudentVO();
				System.out.println("수정할 학번");
				data.setStcode(in.readLine());
				System.out.println("수정할 이름");
				data.setName(in.readLine());
				System.out.println("수정할 나이");
				data.setAge(Integer.parseInt(in.readLine()));
				System.out.println("수정할 학과");
				data.setDept(in.readLine());
				result=service.modify(data);
				if(result)
					System.out.println("수정성공");
				else
					System.out.println("수정실패");
				break;
			case"5":
				service.printall();//호출
			case"6":
				System.out.println("종료");
				System.exit(0);
				break;
			default:
				System.out.println("다시 입력");
			}
		}
	}

}
