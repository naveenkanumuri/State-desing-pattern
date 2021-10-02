

public class TelevisionOn implements State {
	
	public TelevisionOn() {
		this.on();
	}

	@Override
	public void on() {
	 System.out.println("Television is ON ");
		
	}

	@Override
	public void off() {
		System.out.println("Television is OFF State");
	}

	 

}
