package employeeClasses;

import java.util.*;

public class Util 
{

	public static List<Employee> getEmployees() 
	{
		List<Employee> col = new ArrayList<Employee>();
		
		col.add(new Employee(5, "Frank", 28, 1234.55, 1));
		col.add(new Employee(1, "Jorge", 19, 4321.55, 5));
		col.add(new Employee(6, "Bill", 34, 2314.55, 0));
		col.add(new Employee(3, "Michael", 10, 1342.55, 7));
		col.add(new Employee(7, "Simpson", 8, 3124.55, 4));
		col.add(new Employee(4, "Claire",16, 4123.55, 3));
		col.add(new Employee(8, "Lee", 40, 3412.55, 2));
		col.add(new Employee(2, "Mark", 30, 2341.55, 1));
		
		return col;
	}
	
	public static void printList(List<Employee> list, String sortBy) 
	{
		System.out.printf("%s\n%s\n", sortBy, "EmpId\tName\tAge\tSalary");
		for (Employee e: list) 
		{
			System.out.println(e);
		}
	}//end printList()

}