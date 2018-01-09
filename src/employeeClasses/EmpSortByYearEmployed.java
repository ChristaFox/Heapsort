package employeeClasses;
import java.util.Comparator;

public class EmpSortByYearEmployed implements Comparator<Employee>
{

	public int compare(Employee e1, Employee e2) 
	{
		return e1.getYears() - (e2.getYears());
	}

}

