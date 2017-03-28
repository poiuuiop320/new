package vo;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

public class MemberDTO {
 @NotNull(message="반드시 입력하세요.")
 private String id;
 @NotNull(message="반드시 입력하세요.")
 @Size(min=6,message="6자 이상 입력하세요.")
 private String password;
 @NotNull(message="반드시 입력하세요.")
 private String name;
 @Email(message="이메일 형식이 틀립니다.")
 private String email;
 @Size(min=10,message="10 글자 이상 입력하세요")
 private String say;
 private String hobby;
 private String addr;
 @DateTimeFormat(pattern="yyyy-mm-dd")
 private String birth;
 private List<String> fav;
 private List<String> gen;
 private  List<String> food;
 public void setGen(List<String> gen) {
  this.gen = gen;
 }

 public List<String> getFav() {
  return fav;
 }

 public void setFav(List<String> fav) {
  this.fav = fav;
 }


 /**
  * @param id
  * @param password
  * @param name
  * @param email
  * @param say
  * @param gen
  * @param hobby
  * @param addr
  * @param birth
  * @param fav
  */
 public MemberDTO(String id, String password, String name, String email, String say, List<String> gen, String hobby,
   String addr, String birth, List<String> fav ,List<String> food) {
  this.id = id;
  this.password = password;
  this.name = name;
  this.email = email;
  this.say = say;
  this.gen = gen;
  this.hobby = hobby;
  this.addr = addr;
  this.birth = birth;
  this.fav = fav;
  this.food = food;
 }

 public String getId() {
  return id;
 }

 public void setId(String id) {
  this.id = id;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getSay() {
  return say;
 }

 public void setSay(String say) {
  this.say = say;
 }

 public List<String> getGen() {
  return gen;
 }



 public String getHobby() {
  return hobby;
 }

 public void setHobby(String hobby) {
  this.hobby = hobby;
 }

 public String getAddr() {
  return addr;
 }

 public void setAddr(String addr) {
  this.addr = addr;
 }

 public MemberDTO() {
  // TODO Auto-generated constructor stub
 }

 public String getBirth() {
  return birth;
 }

 public void setBirth(String birth) {
  this.birth = birth;
 }

 /**
  * @return the food
  */
 public List<String> getFood() {
  return food;
 }

 /**
  * @param food the food to set
  */
 public void setFood(List<String> food) {
  this.food = food;
 }
 
}
