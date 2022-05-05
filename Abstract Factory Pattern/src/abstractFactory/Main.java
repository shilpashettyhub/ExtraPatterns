package abstractFactory;

public class Main {

	public static void main(String[] args) {
		Factory f1 = new MacOs();
		Factory f2 = new Linux();
		
		System.out.println(f1);
		System.out.println(f1.getAlert().sendAlert());
		System.out.println(f1.getButton().clickButton());
		
		System.out.println(f2);
		System.out.println(f2.getAlert().sendAlert());
		System.out.println(f2.getButton().clickButton());

	}

}
