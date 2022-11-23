import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int rev=0,rem,org;
		int num=1234321;
		System.out.println(num);
		    //Scanner scan=new Scanner(System.in);
		    //System.out.println("Enter a number :: ");
		    //int num=scan.nextInt();
		    org=num;
		    while(num>0)
		    {
		    	rem=num%10;
		    	num=num/10;
		    	rev=rev*10+rem;
		    }
		    if(rev==org)
		    	System.out.println("The given number ("+org+")"
		    			+ "is a Palindrome");
		    else
		    	System.out.println("String "+org+" is not a Palindrome");
		    
    
	}

}
