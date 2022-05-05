package abstractFactory;

public interface AlertBox {
	
	public String sendAlert();

}
class MacOsAlert implements AlertBox{

	@Override
	public String sendAlert() {
		
		return "Linux: Alert!!!!";
	}
	
}
class LinuxAlert implements AlertBox{

	@Override
	public String sendAlert() {
		// TODO Auto-generated method stub
		return "Linux: Alert!!!!";
		
	}
	
}