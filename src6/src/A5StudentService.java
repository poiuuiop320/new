import java.util.ArrayList;
import java.util.Iterator;

public class A5StudentService {

	private ArrayList<A5StudentVO> list;//list메서드 담기




	public A5StudentService(ArrayList<A5StudentVO> list)//인스턴스 초기화
	{
		this.list=list;// list 초기화
	}



	public  boolean  add(A5StudentVO vo)//
	{

		if(!checkid(vo.getStcode()))//
			return false;
		else
		{

			boolean result=list.add(vo);//
			return result;//
		}
	}



	public  boolean checkid(String stucode)
	{
		for(A5StudentVO item:list)//향상for문
		{
			if(item.getStcode().equals(stucode))
				return false;
		}
		return true;
	}



	public A5StudentVO search(String stcode)
	{
		for (A5StudentVO item : list)//향상for문
		{
			if(item.getStcode().equals(stcode))
			{
				return item;
			}
		}
		return null;
	}


	public void printall()
	{
		Iterator<A5StudentVO>ita=list.iterator();//
		while(ita.hasNext())//
			System.out.println(ita.next());//
	}
	public boolean remove(String stcode)//
	{
		if(!checkid(stcode))
		{
			A5StudentVO data=search(stcode);
			boolean result=list.remove(data);
			return result;
		}
		else
		{
			return false;
		}
	}
	public boolean modify(A5StudentVO data)
	{
		if(checkid(data.getStcode()))
		{
			return false;

		}
		else
		{
			/*for (int i = 0; i < list.size(); i++) 
			{
				if(list.get(i).getStcode().equals(data.getStcode()))
				{
					list.set(i, data);
				} 


			}*/
			for (A5StudentVO item : list) {
				if(item.getStcode().equals(data.getStcode())){
					item.setName(data.getName());
					item.setDept(data.getDept());
					item.setAge(data.getAge());
					return true;
				}
			}
			return false;
		}
	}

}


