
public class DuplChar {
	public static void main(String[] args) {
		
		/*print Duplicates charactors ==>> arr[i]>1 ,
		 * print Unique charactors is ==>> arr[i]==1 ,
		 * Print Total Ascii Table Values ===>> arr[i]!=-1  
		 * print Unused charactors is ==>> arr[i]==0
		 */
		
	/*	String s1="sasttirsajusjjaaaahgglkjkfhuieqoirutyfhgbvcmds,643467";
		char ch[]=s1.toCharArray();
		int arr[]=new int[127];
		for(int i=0;i<ch.length;i++)
		{
			arr[ch[i]]++;
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=-1)
			{
				System.out.println("Duplicate Charactor is [ "+i+" ]==>[ "+(char)i+" ] count = "+arr[i]);
				count++;
			}
		}
		System.out.println("Total Duplicate charactors is "+count);
	*/
		// Remove Duplicates in a String
		String a1=" satti raju yarramsetti 2001 @gmail.com";
		String a2="";
		for(int i=0;i<a1.length();i++)
		{
			char ch=a1.charAt(i);
			if(a2.indexOf(ch)==-1)
			{
				a2=a2+ch;
			}
		}
		System.out.println(a1);
		System.out.println(a2);
	}

}
