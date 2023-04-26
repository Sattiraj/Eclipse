package satti;

class Plane
{
	public int age=20;
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	public void takeOff()
	{
		System.out.println("plane is taking off");
	}
	public void land()
	{
		System.out.println("plane is landing");
	}
	
}

class CargoPlane extends Plane
{   
	public int age=30;
	public void fly()
	{
		System.out.println(super.age);
		super.fly();
		
	    System.out.println("Age is "+age);
		System.out.println("CaargoPlane is flies at lower height");
	}
	public void CarryGoods()
	{
		System.out.println("Cargo Plane is Carrying goods");
	}
}
class PassengerPlane extends Plane
{
	public void fly()
	{
		System.out.println("Passengers Plane is flies at medium height");
	}
	public void CarryPassengers()
	{
		System.out.println("Passengers plane Carries Passengers");
	}
}
class FighterPlane extends Plane
{
	public void fly()
	{
		System.out.println("Fighter plane is flies at high height");
	}
}
class Airport
{
	public void Permit(Plane name)
	{
		name.takeOff();
		name.fly();
		name.land();
	}
}
public class LaunchPlane {
	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		Airport a=new Airport();
		a.Permit(cp);
		a.Permit(pp);
		a.Permit(fp);
		
		/*cp.fly();
		cp.land();
		cp.takeOff();
		cp.CarryGoods();
		
		pp.fly();
		pp.land();
		pp.takeOff();
		pp.CarryPassengers();
		System.out.println();
		
		/// polymorphism 
		Plane res;
		res=cp;
		res.fly();
		res.land();
		res.takeOff();
		//res.CarryGoods();
		
		res=pp;
		res.fly();
		res.land();
		res.takeOff();
		//res.carryPassengers();
		 */
		
	}

}
