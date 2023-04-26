import java.util.Arrays;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Palindeome
	
		
		int num=123454321,rem,rev = 0,org=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(org==rev)
		{
			System.out.println("the "+org +"  is palindrome");
		}
		else
		{
			System.out.println("The "+org +"  is not a Palindrome");
		}
		
		 /*  
		String s1="nitin";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s1);
		System.out.println(s2);

		if(s1.equals(s2))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
		*/
		
		//Anagram
	/*	
		String ss1="A gentle man";
		String ss2="Elegant man";
		ss1=ss1.replace(" ","");
		ss2=ss2.replace(" ","");
		ss1=ss1.toLowerCase();
		ss2=ss2.toLowerCase();
		char[] ch=ss1.toCharArray();
		char[]ch2=ss2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch2);
		if(Arrays.equals(ch,ch2))
		{
			System.out.println("String is Anagram");
		}
		else
			System.out.println("String is not Anagram");
	*/
		
		
		
		
	}

}
