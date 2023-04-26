class Name
{
	public static void main(String[] args) {
		for(int i=1;i<=20;i++)
		{
			for(int j=2;j<=10;j++)
			{
				System.out.print(j+" * ");
				System.out.printf("%2d",i);
				System.out.print(" = ");
				System.out.printf("%3d\t",j*i);
			    
			    //System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			
			System.out.println();
		}
		
	}
}