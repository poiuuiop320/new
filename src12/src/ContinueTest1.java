
public class ContinueTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*for(int i =0;i<10;i++)
    {
    	if(i==3) continue;//아래 가 넘어간다.
    	System.out.println(i);
    }*/
		for(int i =0;i<10;i++){
			if(i==3)continue;
		}
		loop: for(int i =0;i<4;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(j>=5)continue loop;
				System.out.print(j);
			}
		}
	}

}
