package week6;
import emp.Employee2;
import bonus.issueBonus;
public class demoPackage 
{
	public static void main(String args[])
	{

	System.out.println("this program illustrates use of package....");
	Employee2 list[]=new Employee2[3];
	for(byte i=0;i<list.length;i++)
		list[i]=new Employee2();
	System.out.println("\n*****************************************");
	System.out.println("empId\tempName\");texpYears\tsalary");
	System.out.println("\n*****************************************");
	for(byte i=0;i<list.length;i++)
	{
		issueBonus.issueEmployeeBonus(list[i]);
		list[i].getEmployee2();
	}
	
	System.out.println("*******************************************");

}
}
