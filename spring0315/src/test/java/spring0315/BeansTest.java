package spring0315;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kic.conf.BeanConf;
import com.kic.map.Map1;
import com.kic.set.MemberDTO;

public class BeansTest {
 public static void main(String[] args) {
  
  AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(BeanConf.class);
  MemberDTO dto=ctx.getBean("create1",MemberDTO.class);
  System.out.println(dto);
  /*configuration bean정보를 얻어옴
  */
  MemberDTO dto2=ctx.getBean("create2",MemberDTO.class);
  System.out.println(dto2);
  
   /*bean 이름을 지정해줬는데 "create3"이거를 자동으로 이름을 해줬는데 name에 지정한 이름을 사용한다. */
  MemberDTO dto3=ctx.getBean("bean3",MemberDTO.class);//("create3",MemberDTO.class);
  System.out.println(dto3);
  
  Map1 ins=ctx.getBean("mBean1",Map1.class);
  System.out.println(ins.getM1().get("a1"));
  System.out.println(ins.getM1().get("a2"));
  ctx.close(); 
  
 }
 
}
