public class AccTest11 {
	 public static void main(String[] args) {
/*	        Acc1 ins=new Acc1();
	        ins.name="ȫ�浿";
	        System.out.println(ins.name);*/

		   Acc1 ins1=new Acc1("��μ�");
		   Acc1 ins2=new Acc1("�αݻ�");
		   ins1.prt();
		   ins2.prt();
		   
		   ins1.setName("kim min su");
		   String irum=  ins1.getName();
		   System.out.println(irum);
		   ins1.prt();
	 
	 
	 }
}
