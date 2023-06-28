package project14_28jun;

public enum Weekend {
	Saturday,
    Sunday;
	
    public static void main(String[] args) {
		Weekend w1 = Weekend.Saturday;
		Weekend w2 = Weekend.Sunday;
		
		System.out.println("Weekends are on: " + w1 + " and " + w2);
	}
 }
