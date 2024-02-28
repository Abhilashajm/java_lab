package week2;

public class values 
{
	byte Byte;
	int integer;
	long Long;
	short Short;
	boolean Boolean;
	String string;
	float Float;
	char ch;
	double Double;
	void getvalues()
	{
	System.out.println("the default value of primitive datatype byte:"+Byte);
	System.out.println("the default value of primitive datatype int:"+integer);
	System.out.println("the default value of primitive datatype Long:"+Long);
	System.out.println("the default value of primitive datatype Short:"+Short);
	System.out.println("the default value of primitive datatype Boolean:"+Boolean);
	System.out.println("the default value of string:"+string);
	System.out.println("the default value of primitive datatype Float:"+Float);
	System.out.println("the default value of primitive datatype char:"+ch);
	System.out.println("the default value of primitive datatype Double:"+Double);
	}
	}
	class defaultvalues
	{
	public static void main(String [] args)
	{
	values var=new values();
	var.getvalues();
	}
}
