package abstractFactory;

public interface Factory {
	public AlertBox getAlert();
	public Buttons getButton();

}
class MacOs implements Factory{

	
	@Override
	public String toString() {
		return "MacOs";
	}

	@Override
	public AlertBox getAlert() {
		// TODO Auto-generated method stub
		return new MacOsAlert();
	}

	@Override
	public Buttons getButton() {
		// TODO Auto-generated method stub
		return new MacOsButton();
	}
	
}
class Linux implements Factory{
    
	@Override
	public String toString() {
		return "Linux";
	}
	
	@Override
	public AlertBox getAlert() {
		// TODO Auto-generated method stub
		return new LinuxAlert();
	}

	@Override
	public Buttons getButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}
	
}