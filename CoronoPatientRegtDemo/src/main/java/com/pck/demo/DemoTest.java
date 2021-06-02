package com.pck.demo;

import java.util.Scanner;
import com.pck.controller.*;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.pck.vo.PatientVO;


public class DemoTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
        System.out.println("Enter Patient Name : ");
        String name=sc.next();
        System.out.println("Enter Patient Address :");
        String addr=sc.next();
        System.out.println("Enter Patient Mobile  No :");
        String mobileNo=sc.next();
        System.out.println("Enter Days of Hospitalized : ");
        String days=sc.next();
        
        PatientVO vo= new PatientVO();
        vo.setPatient_name(name); vo.setPatient_addrs(addr);
        vo.setPatient_mob_no(mobileNo); vo.setDays_of_hospitalized(days);
        
        DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/pck/cfg/applicationContext.xml");
        
        MainController controller=factory.getBean("controller",MainController.class);
    
        try
        {
        	String result=controller.processPatient(vo);
        	System.out.println(result);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	System.out.println("Internal Problem.......try again");
        }
       	}
	

}
