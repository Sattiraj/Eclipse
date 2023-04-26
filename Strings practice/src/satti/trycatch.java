package satti;

public class trycatch {
	public static void main(String[] args) {
		try{
			System.out.println("try block gets executed");
			System.out.println("Sattiraju executed");
			System.out.println(10/0);
			
		}catch(ArithmeticException e){
			System.out.println("catch block gets executed");
			System.out.println(10/0);
		}finally{
			System.out.println("finally block gets executed");
			String s=null;
			System.out.println(s.length());
			
		}
		  System.out.println("statement-6");      

	}

}
