package daytwo.enumexample;

public enum CoffeeSize {
	
	BIG(8),
	HUGE(10),
	OVERWHELMING(16);
	
	private int size;
	
	CoffeeSize(int size){
		this.size = size;
	}

}
