
public class maxchar {
	public static void main(String[] args) {
		String s1="@@@ satti raju @@@@ yarramsetti 2000 @@ gmail.com";
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
				count++;
				System.out.println("Repeated char is [ "+(char)i+" ] count = "+arr[i]);
			}
		}
		System.out.println("Total repeated char is =  "+count);
		int max=arr[0];
		char ch2=' ';
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				ch2=(char)i;
				//System.out.println("Max Repeated char is [ "+(char)i+" ] count === "+max);
			}
		}
		System.out.println("Max Repeated char is [ "+ch2+" ] count ===>>> "+max);
		
		
	}

}
