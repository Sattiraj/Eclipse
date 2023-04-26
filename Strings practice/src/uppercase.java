
public class uppercase {
	public static void main(String[] args) {
		
	/*
		String s1="sattHFDLKiraju";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
			{
				s2=s2+(char)(s1.charAt(i)-32);
			}
			else
			{
				s2=s2+s1.charAt(i);
			}
		}
		
		System.out.println(s1);
		System.out.println(s2);
	
	/*
	
	
	String sat="sattiraju YARRAMSETTI";
	String raj="";
	for(int i=0;i<sat.length();i++)
	{
		if(sat.charAt(i)>='A'&&sat.charAt(i)<='Z');
		{
			raj=raj+(char)(sat.charAt(i)+32);
		}
		else
		{
			raj=raj+sat.charAt(i);
		}
	}
	System.out.println(sat);
	System.out.println(raj);
	
	
	
	*/	
		
	String s1="2sat@^*<.tQO#%*-=_1!!!!!@@@##$$%%^^&&*(((i4raju@SATTi.><'][}+=-09$#(";
	String s2="";
	String s3="";
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
		{
			s2=s2+(char)(s1.charAt(i)-32);
		}
		else if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z')
		{
			s2=s2+(char)(s1.charAt(i)+32);
		}
		else
		{
			 s3=s3+s1.charAt(i);
		}
	}
	System.out.println(s1);
     System.out.println(s2);
     System.out.println(s3);

	
	
	
	}
}
	
