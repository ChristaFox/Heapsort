package heapClasses;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

import employeeClasses.EmpSortByAge;
import employeeClasses.EmpSortByEmpId;
import employeeClasses.EmpSortBySalary;
import employeeClasses.EmpSortByYearEmployed;
import employeeClasses.Employee;
import employeeClasses.Util;

/**
 * Illustrate heapSort().
 */
public class HeapSortEx {

  public static<T> List<T> heapSort( Collection<? extends T> collection,
                                     Comparator<? super T>comparator ) {
    if ( collection == null || comparator == null ) {
      return null;
    }
    Heap<T> heap = new ArrayMinHeap<T> ( collection, comparator );
    List<T> list = new ArrayList<T> ();
    while ( !heap.isEmpty() ) {
      T e = heap.top();
      list.add( e );
    }
    return list;
  }

  public static void main( String[] args ) 
  {

	  List<Employee> empList = Util.getEmployees();
	  EmpSortByEmpId empID = new EmpSortByEmpId();
	 
    Comparator<Employee> empCompareByID = new Comparator<Employee> () {
      public int compare( Employee e1, Employee e2 ) {
        if ( e1.getEmpId() == e2.getEmpId() ) {
          return 0;
        }
        if ( e1.getEmpId() < e2.getEmpId() ) {
          return -1;
        }
        return 1;
      }
    };

    empList = heapSort( empList, empCompareByID );
    System.out.println("Sorted by ID number: ");
    for ( Employee i : empList ) {
      System.out.print( " " + i );
      System.out.println();
    }
    System.out.println();
//-------------------------------------------------------------------------
    EmpSortByAge empByAge = new EmpSortByAge(); 
	 
    Comparator<Employee> empCompareByAge = new Comparator<Employee> () {
      public int compare( Employee e1, Employee e2 ) {
        if ( e1.getAge() == e2.getAge() ) {
          return 0;
        }
        if ( e1.getAge() < e2.getAge() ) {
          return -1;
        }
        return 1;
      }
    };

    empList = heapSort( empList, empCompareByAge );
    System.out.println("Sorted by age: ");
    for ( Employee i : empList ) {
      System.out.print( " " + i );
      System.out.println();
    }
    System.out.println();

  //-------------------------------------------------------------------------
    EmpSortBySalary empBySalary = new EmpSortBySalary(); 
	 
    Comparator<Employee> empCompareBySalary = new Comparator<Employee> () {
      public int compare( Employee e1, Employee e2 ) {
        if ( e1.getSalary() == e2.getSalary() ) {
          return 0;
        }
        if ( e1.getSalary() < e2.getSalary() ) {
          return -1;
        }
        return 1;
      }
    };

    empList = heapSort( empList, empCompareBySalary );
    System.out.println("Sorted by salary: ");
    for ( Employee i : empList ) {
      System.out.print( " " + i );
      System.out.println();
    }
    System.out.println();
  
  //-------------------------------------------------------------------------
  EmpSortByYearEmployed empByYears = new EmpSortByYearEmployed(); 
	 
  Comparator<Employee> empComparebyExp = new Comparator<Employee> () {
    public int compare( Employee e1, Employee e2 ) {
      if ( e1.getYears() == e2.getYears() ) {
        return 0;
      }
      if ( e1.getYears() < e2.getYears()) {
        return -1;
      }
      return 1;
    }
  };

  empList = heapSort( empList, empComparebyExp );
  System.out.println("Sorted by exp: ");
  for ( Employee i : empList ) {
    System.out.print( " " + i );
    System.out.println();
  }
  System.out.println();

}
  
}
