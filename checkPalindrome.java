package Week7;
import java.util.Scanner;
public class Checkpalindrome {

	public static void main(String[] args) {
		String str_original="",reversestr="";
		Scanner inScanner=new Scanner(System.
		in);
		System.out.println("Enter any valid String");
		str_original=inScanner.next();
		inScanner.close();
		int str_length=str_original.length();
		System.out.println("length is...."+
		str_length);
		for(int i=(str_length-1);i>=0;--i) {
			reversestr=reversestr+str_original.
			charAt(i);
		}
		if(str_original.
		equalsIgnoreCase(reversestr))
		{
			System.out.println("The given " +
			"String \""+str_original + 
			"\" is a Palindrome.");
		}
		else {
			System.out.println("The given " +
			" String \""+str_original +"\" is not a              Palindrome.");
		}
	}
}