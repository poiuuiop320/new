package vo;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class BoardDTO {
 @Min(value=1,message="숫자 입력해야 합니다." )
 private int num;
 @NotEmpty(message="title 을 작성하지 않았습니다.")
 @Size(min=3,message="3글자수 입력해야합니다.")
 private String title;
 @NotEmpty(message="20 not null")
 @Size(max=20 ,message="20내용은 글자 이상 작성해야 합니다.")
 private String content;
 private String writer;
 @Email(message="email패턴이 틀렸습니다.")
 private String email;
 /**
  * @param num
  * @param title
  * @param content
  * @param writer
  * @param email
  */
 public BoardDTO(int num, String title, String content, String writer, String email) {
  this.num = num;
  this.title = title;
  this.content = content;
  this.writer = writer;
  this.email = email;
 }
 public String getEmail() {
  return email;
 }
 public void setEmail(String email) {
  this.email = email;
 }
 public int getNum() {
  return num;
 }
 public void setNum(int num) {
  this.num = num;
 }
 public String getTitle() {
  return title;
 }
 public void setTitle(String title) {
  this.title = title;
 }
 public String getContent() {
  return content;
 }
 public void setContent(String content) {
  this.content = content;
 }
 public String getWriter() {
  return writer;
 }
 public void setWriter(String writer) {
  this.writer = writer;
 }

 public BoardDTO() {
  // TODO Auto-generated constructor stub
 }
 
}
