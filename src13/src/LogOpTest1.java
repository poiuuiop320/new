/*
 * &&and 
 * ||or
 * 
 * 
 * 
*/public class LogOpTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //System.out.println(10==10&&10!=10);
 boolean log1=10>=9;
 boolean log2=10==9;
 
 	boolean result = log2&&log1; // &&  false 확률이 높은거 를먼저
 	System.out.println(result);
 	boolean result2= log1||log2; //||  은 ture 확률이 높은거를 먼저.
 	System.out.println(result2);
	}

}
