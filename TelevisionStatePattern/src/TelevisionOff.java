

public class TelevisionOff implements State {
	
	TelevisionOff(){
		off();
	}

	@Override
	public void on() {
		System.out.println("Television is ON state");
		
	}

	@Override
	public void off() {
		System.out.println("Television is OFF ");
		
	}

	 
}
