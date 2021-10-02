

public class TelevisionStatePatternDemo {

	public static void main(String[] args) { 
		
		TvContext tvState =  new TvContext();
		
		System.out.println("Displyaing Tv States \n*****************************************");
		
		tvState.start();
		
		tvState.change();
		
		
	}

}
