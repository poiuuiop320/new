package com.kic.Hw;

import java.util.Hashtable;

public class StudentPro {
  private Hashtable<String, StudentDTO> ht=new Hashtable<>();
  public  void add(StudentDTO data) throws Exception
  {
	  String hak=data.getHak();
	   ht.put(hak, data);
	 
  }
	
  public boolean isCheckHak(String str)
  {
	   boolean result=  ht.containsKey(str);
	   return result;
  }
	
}
