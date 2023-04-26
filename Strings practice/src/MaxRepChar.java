
public class MaxRepChar {

	public static void main(String[] args) {
	/*
		String s1="sattii ###@@@!!%%% 4tttttssssss  sssjsssssssssssssssssss444---- ++===00000 ))))(((((( &&&&--- ____433333 ddfgrydvgrttq  ceerryter  dftjyjdstt sarajuyerramstti";
		s1=s1.toUpperCase();
		char[] ch=s1.toCharArray();
		int arr[]=new int[127];
		for(int i=0;i<ch.length;i++)
		{
			arr[ch[i]]++;
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>1)
			{
				System.out.println("Repeated char is [ "+(char)i+" ] count = "+arr[i]);
			count++;
			} 
		}
		System.out.println("Total Rep char is "+count);
		int max=arr[0];
		char ch2=' ';
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[ch[i]])
			{
				max=arr[ch[i]];
				ch2=ch[i];
			}
		}
		System.out.println("MAx Repeated Char is ::[  "+ch2 +" ]   count = "+max);
		
		*/
		String s1="sattii ###@@@!!%%% 4tttttssssss  sssjsssssssssssssssssss444---- ++===00000 ))))(((((( &&&&--- ____433333 ddfgrydvgrttq  ceerryter  dftjyjdstt sarajuyerramstti";
		s1=s1.toUpperCase();
		char[] ch=s1.toCharArray();
		int arr[]=new int[127];
		for(int i=0;i<ch.length;i++)
		{
			arr[ch[i]]++;
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>1)
			{
				System.out.println("Repeated char is [ "+(char)i+" ] count = "+arr[i]);
			count++;
			} 
		}
		System.out.println("Total Rep char is "+count);
		int DupRemove=0;
		char ch2=' ';
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[ch[i]])
			{
				System.out.println("Duplicate charactor is "+arr[i]);
				continue;
			}
		}
		System.out.println("MAx Repeated Char is ::[  ");
		
		
		/*		
		String s="Satti Raju Yerramsetti";
		System.out.println(s);
		s=s.replace(" ", "").toLowerCase();
		System.out.println(s);		
		int[] arr=new int[127];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)]++;//=arr[s.charAt(i)]+1;
		}
		int max=-1;
		char ch=' ';
		for(int i=0;i<127;i++){
			if(arr[i]>1){
                 System.out.println("Repeated  Characters is [ "+(char)(i)+" ] count = "+arr[i]);
			}
		}
		
		for(int i=0;i<s.length();i++) {
			if(max<arr[s.charAt(i)]) {
				max=arr[s.charAt(i)];
				ch=s.charAt(i); 
			}
		}
		System.out.println("Maximum Repeated Characters is [ "+ch+" ]  count = "+max);
	*/
	}
}
