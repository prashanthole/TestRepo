package com.prash;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.prash.controller.MainController;
import com.prash.vo.CountriesVO;

@SpringBootApplication
public class BootProj2CountriesSearchApplication {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Countries count : ");
		int count=sc.nextInt();
		String ids[]=null;
		if(count>=1)
			ids=new String[count];
		else
		{
			System.out.println("by......");
			//System.exit(0);
			return;
		}
		for(int i=0;i<count;++i)
		{
			System.out.println("Enter Country Id : "+(i+1));
			String idStr=sc.next();
			ids[i]=idStr;
		}
		ApplicationContext ctx=SpringApplication.run(BootProj2CountriesSearchApplication.class, args);
		
		MainController controller =ctx.getBean("controller",MainController.class);
		try
		{
			List<CountriesVO> listVO=controller.showCountriesById(ids);
			listVO.forEach(vo->System.out.println(vo));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("System.......problem");
		}
	}

}
