package WEEK6;
import java.util.Scanner;
public class demoSRPCalculator {
	double result = 0;
	readInputsValues input = new readInputsValues();
	switch(input.operation) {
	case '+':
		result=Addition.sum(input);break;
	case '-':
		result=subraction.difference(input);break;
	case '*':
		result=multiplication.product(input);break;
	case '/':
		result=division.Quotient(input);break;
	case '%':
		result=modulus.remainder(input);break;
	}	
}
class readInputsValues{
	double num1, num2;
	char operation;
	readInputsValues(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter non zero number...");
		num1=sc.nextDouble();
		System.out.println("enter non integer number...");
		num2=sc.nextDouble();
		System.out.println("enter your choice...");
		operation=sc.next().charAt(0);
		sc.close();
	}
}
class Addition{
	public static double sum(readInputsValues ip) {
		return(ip.num1 + ip.num2 );		
	}
}
class subraction{
	public static double difference(readInputsValues ip) {
		return(ip.num1 - ip.num2);
	}
}
class multiplication{
	public static double product(readInputsValues ip) {
		return(ip.num1 * ip.num2);
	}
}
class division{
	public static double Quotient(readInputsValues ip) {
		return(ip.num1 / ip.num2);
	}	
}
class modulus{
	public static double remainder(readInputsValues ip) {
		return(ip.num1 % ip.num2);
	}	
}
}