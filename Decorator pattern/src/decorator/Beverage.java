package decorator;

public abstract class Beverage {
	
	public abstract String getDesc();
	public abstract int Cost(); 
	
}
class Espresso extends Beverage{
    
	String name = "Espresso ";
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int Cost() {
		// TODO Auto-generated method stub
		return 120;
	}
	
}
class Decaf extends Beverage{
     
	String name = "Decaf ";
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int Cost() {
		// TODO Auto-generated method stub
		return 100;
	}
	
}
abstract class AddOnDecorator extends Beverage{
	
}
class Caramel extends AddOnDecorator{
    Beverage b;
    int cost = 25;
    
	protected Caramel(Beverage b) {
		this.b = b;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return " Caramel ";
	}

	@Override
	public int Cost() {
		// TODO Auto-generated method stub
		return this.b.Cost()+ this.cost;
	}
	
}
class Soy extends AddOnDecorator{
	
	Beverage b;
    int cost = 35;
    
	protected Soy(Beverage b) {
		this.b = b;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return " Soy Milk ";
	}

	@Override
	public int Cost() {
		// TODO Auto-generated method stub
		return this.b.Cost()+ this.cost;
	}
	
}

class mainn{
	public static void main(String[] args) {
		
		Espresso e = new Espresso();
		Caramel c = new Caramel(e);
		Soy s = new Soy(c);
		System.out.println("Your cost is "+s.Cost());
		
	   Caramel k = new Caramel(new Soy(new Decaf()));
	   System.out.println("Your cost is " + k.Cost());
		
	}
}






