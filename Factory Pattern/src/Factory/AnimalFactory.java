package Factory;

import Factory.Cat;
import Factory.Dog;
import Factory.Duck;



public interface AnimalFactory {
    public Animal createAnimal();
}
class BalancedFactory implements AnimalFactory{
    private static int CountC = 0;
    private static int CountD = 0;
	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		if(CountC <= CountD) {
			CountC++;
			return new Cat();}
		else {
			CountD++;
			return new Dog();}	
	}
	
	
}
class RandomFactory implements AnimalFactory{
    
	public static boolean c = true;
	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		c = !c;
		if(c)
			return new Cat();
		else
			return new Dog();
	}
	
	
	
}