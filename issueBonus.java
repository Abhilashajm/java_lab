package bonus;
import emp.Employee2;
public class issueBonus 
{
	public static void issueEmployeeBonus(Employee2 emp)
	{
		if(emp.expYears > 10)
			emp.salary = emp.salary + (emp.salary + 0.15f);
		else
			emp.salary = emp.salary + (emp.salary + 0.15f);
		
	}

}
