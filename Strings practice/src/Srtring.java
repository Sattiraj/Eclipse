import java.util.Arrays;

class Srtring
{
	public static void main(String[] args) {
		/*
		String  s1="csdat sdgre";
		String s2="racdfjd dfke";
		s1=s1.replace(" ","");
		s2=s2.replace(" ","");
		char[] ch1=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		//Arrays.sort(ch1);
	     //Arrays.sort(ch2);
		System.out.println(ch1);
		System.out.println(ch2);
	   for(int i=0;i<ch1.length;i++)
		{
			for(int j=i+1;j<ch1.length;j++)
			{
				if(ch1[j]<ch1[j-1])
				{
					char temp=ch1[j];
					ch1[j]=ch1[j-1];
					ch1[j-1]=temp;
				}
			}
		}
		for(int i=0;i<ch2.length;i++)
		{
			for(int j=i+1;j<ch2.length;j++)
			{
				if(ch2[j]<ch2[j-1])
				{
					char temp=ch2[j];
					ch2[j]=ch2[j-1];
					ch2[j-1]=temp;
				}
			}
		}

		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("String are anagram");
		}
		else
		{
			System.out.println("String are not Anagram");
		}
		
		System.out.println(ch1);
		System.out.println(ch2);
		*/
		
		String s1="satti SATTI RAJU raju yerramsetti";
		System.out.println("String is ::  "+s1);
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Enter a String : ");
		//String s1=scan.nextLine();
		int[] str=new int[126];
		for(int i=0;i<s1.length();i++)
		{
			str[s1.charAt(i)]++;
		}
		for(int i=0;i<126;i++)
		{
			if(str[i]>=1)
			{
                 System.out.println("String Duplicate char is [ "+(char)(i)+" ] count = "+str[i]);
			}
		}	

	}
}

