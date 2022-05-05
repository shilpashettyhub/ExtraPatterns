package Factory;

public class Main {

	
	public static void main(String[] args) {
		Animal a1 =  new BalancedFactory().createAnimal();
		Animal a2 =  new BalancedFactory().createAnimal();
		
		Animal b1 =  new BalancedFactory().createAnimal();
		Animal b2 =  new RandomFactory().createAnimal();
		
		System.out.println("First time calling Balanced Factory \n"+ a1+"\n"+a1.cry()+"\n"+a1.eat()+"\n");
		System.out.println("Second time calling Balanced Factory \n"+a2+"\n"+ a2.cry()+"\n"+a2.eat()+"\n");
		
		System.out.println("First time calling Random Factory \n"+ b1+"\n"+b1.cry()+"\n"+b1.eat()+"\n");
		System.out.println("Second time calling Random Factory \n"+b2+"\n"+ b2.cry()+"\n"+ b2.eat()+"\n");
	}
}
