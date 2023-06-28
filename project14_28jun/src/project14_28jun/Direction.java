package project14_28jun;

public enum Direction {
	North,
    East,
    West,
    South;
	
    public static void main(String[] args) {
		Direction d1 = Direction.North;
		Direction d2 = Direction.East;
		Direction d3 = Direction.West;
		Direction d4 = Direction.South;

		
		System.out.println("Directions are:"+ d1+d2+d3+d4);
	}
 }

