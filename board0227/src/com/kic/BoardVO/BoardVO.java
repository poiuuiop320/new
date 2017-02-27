package com.kic.BoardVO;

import java.util.Date;

public class BoardVO
{
 private int num;
 private String title;
 private String content;
 private String writer;
 private Date writedate;
 private int readno;
 private int rnum;
 public BoardVO(){}

 public BoardVO(int num, String title, String content, String writer) {
  super();
  this.num = num;
  this.title = title;
  this.content = content;
  this.writer = writer;
 }
 public int getRnum()
 {
  return rnum;
 }
 public void setRnum(int rnum)
 {
  this.rnum = rnum;
 }
 public int getNum()
 {
  return num;
 }
 public void setNum(int num)
 {
  this.num = num;
 }
 public String getTitle()
 {
  return title;
 }
 public void setTitle(String title)
 {
  this.title = title;
 }
 public String getContent()
 {
  return content;
 }
 public void setContent(String content)
 {
  this.content = content;
 }
 public String getWriter()
 {
  return writer;
 }
 public void setWriter(String writer)
 {
  this.writer = writer;
 }
 public Date getWritedate()
 {
  return writedate;
 }
 public void setWritedate(Date writedate)
 {
  this.writedate = writedate;
 }
 public int getReadno()
 {
  return readno;
 }
 public void setReadno(int readno)
 {
  this.readno = readno;
 }
}
