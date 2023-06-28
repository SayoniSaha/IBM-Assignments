package project14_28jun;

public enum DaysOfWeek {
	Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday;
	public static void main(String[] args) {
		DaysOfWeek today = DaysOfWeek.Wednesday;
		System.out.println("Day:  " + today);
	}
}

