package com.springcore.Que12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		List<Employee> elist = new ArrayList<>();
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/Que12/applicationContextQ12.xml");

		Employee e1= (Employee) ac.getBean("empbean1");
		Employee e2= (Employee) ac.getBean("empbean2");
		Employee e3= (Employee) ac.getBean("empbean3");
		Employee e4= (Employee) ac.getBean("empbean4");
		
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		
		System.out.println("Enter Department : ");
		String dept1 = sc.next();
		Employee emp1 = elist.stream().filter(s->s.department.equals(dept1 )).max((a1,a2)->a1.salary>a2.salary ? 1:-1).get();
	
		
		System.out.println("name is "+ emp1.empname+" has" + " Maximum salary = " + emp1.salary);
		System.out.println("===================================");
		Employee emp2 = elist.stream().max((a1, a2) -> a1.salary > a2.salary ? 1 : -1).get();
		System.out.println("Employee has highest salary is "+e4);
		
		System.out.println("***************************************************");
		
		
		Employee max = elist.stream().max((b1, b2) -> b1.salary > b2.salary ? 1 : -1).get();

		System.out.println(max.toString());
		System.out.println("===========================================");
		Double avg = elist.stream().collect(Collectors.averagingDouble(e -> e.salary));
          System.out.println("Average number is"+avg);
          List<Employee> minimumavg= elist.stream().filter(i->i.salary< avg).toList();

          for(Employee a:minimumavg) {
          	
          	System.out.println(a.empname+" "+a.salary);
          }
          System.out.println("============================");
          List<String > department=elist.stream().map(r->r.department).distinct().toList();
      	for(String d:department) {
      		Double avg1=elist.stream().filter(e->e.department.equals(d)).collect(Collectors.averagingDouble(e->e.salary));
      	System.out.println("Avarage Salary = "+avg1+" = Department = "+d);
      	
      	}		
	}

}
