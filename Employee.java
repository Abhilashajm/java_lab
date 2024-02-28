package week2;

public class Employee 
{	
	String empName;
	int empNo;
	byte expYrs;
	String gender;
	double basicSalary;
	double bonus;
	double netSalary;
		
	void setEmployee(String Name, int no, String sex, byte ex, double basicSalary) 
	{
	empName=Name;
	empNo=no;
	gender=sex;
	expYrs=ex;
	this.basicSalary=basicSalary;
	}
	void getEmployeeDetails() 
	{
		if (gender=="female") 
		{
			bonus=basicSalary*10/100;
			netSalary=basicSalary+bonus;
		}
		else 
		{
			netSalary=basicSalary;
		}
		System.out.println(empName+"\t"+empNo+"\t"+gender+"\t"+expYrs+"\t"+basicSalary+"\t"+bonus+"\t"+netSalary+"\n");
	}

public class EmployeeDetails
{
	public static void main(String[] args) 
	{
		System.out.println("empName\t empno\tgender\texpYrs\tbasicSalary\tbonus\tnetSalary \n");
		Employee Rashmi=new Employee();
		Rashmi.setEmployee("Rashmi", 128966, "female", (byte) 20, 100000.0d);
		Rashmi.getEmployeeDetails();
		Employee Rakesh = new Employee();
		Rakesh.setEmployee("Rakesh", 7851161, "male", (byte) 25, 200000.0d);
		Rakesh.getEmployeeDetails();
		Employee Madhu = new Employee();
		Madhu.setEmployee("Madhu", 7851161, "female", (byte) 25, 150000.0d);
		Madhu.getEmployeeDetails();
	}
}

}
