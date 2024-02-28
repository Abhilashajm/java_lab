package week2;

public class Hospital 
{
	//instance variable
	String patientName;
	int patientId;
	//static variable
	static String docName = "Dr.Murthy";
		
	void sethospital(String pN,int pId)
	{ 
		patientName=pN;
		patientId=pId;
	}
	String getpatientName()
	{
		return patientName;
	}
	int getpatientId()
	{
		return patientId;
	}
}
class Demoscopeofvariable
{
	public static void main(String args[])
	{
		//local variables
		String hospitalname = "apollo hospital";
		Hospital patient1=new Hospital();
		patient1.sethospital("anita joseph",101);
		System.out.println("the patient "+patient1.getpatientName()+" with the id "+patient1.getpatientId()+" is treated by "+patient1.docName+" at "+hospitalname);
	}
}



