
public class reverse {
	public static void main(String[] args) {
		String s1="Satti raju";
		String s2="";
		String str[]=s1.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			s2=s2+str[i]+" ";
		}
		System.out.println( s1);
		System.out.println(s2);
		
		
		String s3="ineuron java";
		String s4="";
		String st[]=s3.split(" ");
		for(String elem:st)
		{
			for(int i=elem.length()-1;i>=0;i--)
		    {
			    s4=s4+elem.charAt(i);
		    }
			s4=s4+" ";
		}
		System.out.println( s3);
		System.out.println(s4);
	
	
	}

}
