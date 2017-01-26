
public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] arr={20,70,40,100,10};
 int a;
 
   for (int i = 0; i < arr.length-1;i++)
   {
	   for (int j = i+1; j < arr.length; j++) 
	   {
		 if (arr[i]<arr[j])//j보다 작을떄i가
		 {
			a=arr[i];
			arr[i]=arr[j];
			arr[j]=a;
		}
	   } 
   }
		for (int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+"\t");
			System.out.println("\t");
		}
		
	   
       

	

}
}
