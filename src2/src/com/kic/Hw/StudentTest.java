package com.kic.Hw;

import com.kic.Hw.*;

import java.util.Scanner;

/** 
 * studentTest ddfs
 *  
 * @author kitcoop
 * @author hong gil dong
 * 
 * @version 1.0
 * 
 */
public class StudentTest {
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   StudentPro pro=new StudentPro();
	   while(true)
	   {
		   System.out.println("1. add");
		   System.out.println("2. 2");
		   System.out.println("3. 2");
		   System.out.println("4. 3");
		   System.out.println("5. 4");
		   System.out.println("6. 5");
		   String ch=sc.nextLine();
		   
		   switch (ch) {
		   case "1":
			System.out.println("22");
			String hak=sc.nextLine();
			boolean result= pro.isCheckHak(hak);
			if(result)
			{
				System.out.println("22");
			}else
			{
				System.out.println("input name");
				String name=sc.nextLine();
				System.out.println("input age");
				int age=sc.nextInt();
				StudentDTO dto=new StudentDTO(hak, name, age);
				try{
				   pro.add(dto);
				} catch(Exception e)
				{
					System.out.println(e);
				}
			}
			break;

		default:
			break;
		}
		   
		   
		   
	   }
	   

	}
}
