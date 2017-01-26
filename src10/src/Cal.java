public class Cal
{
	//private int su1,su2;
	public int add(int su1,int su2)
	{
		return su1+su2;
	}
	public int sub(int su1, int su2)
	{
		return su1-su2;
	}
	public int mul(int su1,int su2)
	{
		return su1*su2;
	}
	public String div(int su1, int su2)
	{
		if(su2==0)
			return "0으로 나눌수 없다.";
		else if (su1%su2==0)
			return (su1/su2)+"";
		else
			return (su1/(float)su2)+"";
		
		 
	}
}