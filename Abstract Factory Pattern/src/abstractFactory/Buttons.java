package abstractFactory;

public interface Buttons {
	
	public String clickButton();

}
class MacOsButton implements Buttons{

	@Override
	public String clickButton() {
		
		return "MacOS: Button Pressed!!!!";
	}
	
}
class LinuxButton implements Buttons{

	@Override
	public String clickButton() {
		// TODO Auto-generated method stub
		return "Linux: Button Pressed!!!!";
		
	}
	
}