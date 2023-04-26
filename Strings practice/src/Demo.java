
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String s="sachin";
        System.out.println(s.concat("tendulkar"));
      s+="IND";
      s=s+"MI";
      System.out.print(s);

		
		String a=new String("abc");
		String b=new String("abc");
		String c=a.concat("Satti");
		System.out.println(c);
		System.out.println(a==b);
				System.out.println(a.equals(b));
				System.out.println(a.charAt(2));
				System.out.println(a.concat("ABC"));
				
		
		String str="Satti";
		//String B=a.concat("Raju");
		str+="Raju";
		
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.substring(0));
		System.out.println(str.substring(5,9));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		 
		String s="   SAttiRAju   ";
		System.out.println(s.length());
		System.out.println(s.trim());
		System.out.println(s.substring(0));
		System.out.println(s.trim().length());
		//System.out.println(s.toString());
		System.out.println(s);
		*/
		
		
		StringBuilder s=new StringBuilder();
		s.append("abcdefghijklmnop");
		System.out.println(s.length());
		System.out.println(s.capacity());
		s.append("qrstuvwxyz");
		System.out.println(s.length());
		System.out.println(s.capacity());
		System.out.println(s.charAt(20));
		s.setCharAt(25,'Z');
		s.append(123);
		s.append(3.144);
		s.append(true);
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("sachinttendulkar");
		sb.deleteCharAt(6);
		System.out.println(sb);
		
	}

}
