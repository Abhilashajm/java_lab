package emp;
import java.util.Scanner;
public class Employee2 
{
	short empId;
	public int expYears;
	String empName;
	public float salary;
	public Employee2()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter employeee number....");
		empId =Short.parseShort(sc.next());
		System.out.println("enter employeee Name...");
		empName = sc.next();
		System.out.println("enter employeee grosse salary...");
		salary = Float.parseFloat(sc.next());
		System.out.println("enter employeee years of experience...");
		expYears = Integer.parseInt(sc.next());
	}
	public void getEmployee2()
	{
		System.out.println(empId+"\t"+empName+"\t"+expYears+"\t"+salary);
	}

}
