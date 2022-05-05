package Factory;

public interface Animal {
	
	public String eat();
	public String cry();

}
class Cat implements Animal{

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Cat is eating..........";
	}

	@Override
	public String toString() {
		return "Cat object created";
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "Cat is crying..........";
	}
	
}
class Dog implements Animal{

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Dog is eating..........";
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "Dog is crying..........";
	}

	@Override
	public String toString() {
		return "Dog object created";
	}
	
}
class Duck implements Animal{

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Duck is eating..........";
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "Duck is crying..........";
	}
	
}