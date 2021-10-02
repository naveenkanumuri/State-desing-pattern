
public class TvContext {
	

	
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void change() {
		
	 state = new TelevisionOff();
		
	}
	
	public void start() {
		state =  new TelevisionOn();
	}
	
	public void stop() {
		state =  new TelevisionOff();
	}
	
	 



}
