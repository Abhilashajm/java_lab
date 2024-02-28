package week2;

public class student 
{
	String studname;
	String dept;
	int rollno;
	static String college="GPT";
	int percentage;
	void setstudent(String name , int rno , String cdept , int per)
	{
	studname=name;
	rollno = rno;
	dept=cdept;
	percentage = per;
	}
	void getstudent()
	{
	System.out.println(studname+"\t\t"+rollno+"\t"+college+"\t\t"+dept+"\t\t"+percentage);
	}
	}
	class stud
	{
	public static void main(String args[])
	{
	System.out.println("name\t\trollno\tcollege\t\tdepartment\tpercentage");
	student stud1=new student();
	student stud2=new student();
	stud1.setstudent("manasa",165,"CS",88);
	stud2.setstudent("inchara",100,"EC",90);
	stud1.getstudent();
	stud2.getstudent();
	}
}
