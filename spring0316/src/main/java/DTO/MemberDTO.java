package DTO;

import org.springframework.beans.factory.annotation.Required;

public class MemberDTO {
private String name;
private String addr;

public String getName() {
 return name;
}
@Required//must use 
public void setName(String name) {
 this.name = name;
}
public String getAddr() {
 return addr;
}
public void setAddr(String addr) {
 this.addr = addr;
}
@Override
public String toString() {
 return "MemberDTO [name=" + name + ", addr=" + addr + "]";
}

}
