package satti;

abstract class Loan
{
	abstract public void dispInterest();
	public void welcomeNote()
	{
		System.out.println("Welcome to the SBI Bank");
	}
}
class HomeLoan extends Loan 
{
	public void dispInterest()
	{
		System.out.println("Rate of Interest is 12 %");
	}
}
class EducationalLoan extends Loan
{

	@Override
	public void dispInterest() {
		// TODO Auto-generated method stub
		System.out.println("Rate of Interest is 15 %");
	}
	
}
class BesunessLoan extends Loan
{
	public void dispInterest()
	{
		System.out.println("Its working ");
	}
}
public class Abstruction {
public static void main(String[] args) {
	//Loan l=new Loan();
	HomeLoan h=new HomeLoan();
	h.dispInterest();
	h.welcomeNote();
	Loan l=new EducationalLoan();
	l.dispInterest();
	l.welcomeNote();
}
}
