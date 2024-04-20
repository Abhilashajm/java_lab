package activity;

class actstudent 
{
	    private String name;
	    private int id;
	    private double GPA;
	    public actstudent(String name, int id, double GPA) {
	        this.name = name;
	        this.id = id;
	        this.GPA = GPA;
	    }
	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("GPA: " + GPA);
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }
 
	    public double getGPA() {
	        return GPA;
	    }
	    public void setGPA(double GPA) {
	        this.GPA = GPA;
	    }
	    public class demoStudent
	    {
	    	public static void main(String[] args) 
	    	{
	    
	        // Create an instance of the Student class
	        actstudent student1 = new actstudent("Abhilasha", 104, 4.8);
	        System.out.println("Initial Student Info:");
	        student1.displayInfo();
	        student1.setName("Gouthami");
	        student1.setId(101);
	        student1.setGPA(2.4);
	        System.out.println("\nModified Student Info:");
	        student1.displayInfo();
	    	}
	    }
	    
}
	


