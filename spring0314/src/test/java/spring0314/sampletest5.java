package spring0314;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.kic.sample5.MemberDTO;
import com.kic.sample5.MemberService;

public class sampletest5 {

 public static void main(String[] args) {
//  GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("com.kic/app5.xml","classpath:com.kic/app6.xml");
  
  String[] arr={"com.kic/app5.xml","com.kic/app6.xml"};
  GenericXmlApplicationContext ctx= new GenericXmlApplicationContext(arr);
  
  MemberDTO dto =ctx.getBean("member1", MemberDTO.class);
  MemberService service=ctx.getBean("service1", MemberService.class);
  dto.prt();
  service.read();
  service.write();
  ctx.close();
 }

}
