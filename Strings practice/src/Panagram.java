
public class Panagram {
	public static void main(String[] args) {
	//  Panagrm
	  
	 
		boolean result=true;
		String s1="The Quick Brown Fox Jumps Over The Lazy Dog";
		s1=s1.replace(" ","");
		s1=s1.toLowerCase();
		System.out.println(s1);
		char[] ch=s1.toCharArray();
		int[] arr=new int [26];
		for(int i=0;i<ch.length;i++)
		{
			arr[ch[i]-97]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				System.out.println("String is not panagram");
				result=false;
			}
			
		}
		if(result==true)
		{
			System.out.println("String is Pangram");
		}
		
		/*
		//Duplicates
		
		
		String s1="satti Raju @ Yerramsetti R20011@gmail.com";
		
		
		char[] ch=s1.toCharArray();
		int[] arr=new int[126];
		for(int i=0;i<ch.length;i++)
		{
			arr[ch[i]]++;
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>1)
			{
				System.out.println("String Duplicate Charactor is ["+(char)i+"] count = "+arr[i]);
		        count++;
			}
		}
		System.out.println("Total Duplicate char is ::"+count);
		*/
	}

}
