import java.io.PrintStream;

public class B9SystemMethodtest {
	public static void main(String[] args) {
		//out¿« ≈∏¿‘
		PrintStream s = System.out; 
		/*s.print("hong");
		s.print(10);
		s.print(10.2);
		s.print(10);
		s.print(2.2f);
		s.println();
		s.println("park");
		s.print("ttt");
		*/
		s.append("park");
		s.append("honggildong");
		s.flush();
		s.append("23223232");
	}

}
