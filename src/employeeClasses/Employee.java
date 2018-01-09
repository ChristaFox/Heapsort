package employeeClasses;

public class Employee implements Comparable<Employee> 
{
	private int empId;
	private String name;
	private int age;
	private Double salary;
	private int years;
	
	public Employee(int empId, String name, int age, Double salary , int years) 
	{
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.years = years;
	}
	
	// getters & setters
	public int getYears() 
	{
		return years;
	}

	public void setYears(int years) 
	{
		this.years = years;
	}

	public int getEmpId()
	{
		return empId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public Double getSalary()
	{
		return salary;
	}
	
	/**
	* Compare a given Employee with this object.
	* If employee id of this object is 
	* greater than the received object,
	* then this object is greater than the other.
	*/
	public int compareTo(Employee other) 
	{
		return this.empId - other.empId ;
	}	
	
	@Override
	public String toString()
	{
		return getEmpId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t" + getYears();
	}
	
}