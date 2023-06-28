package project12_27jun;

class TestEquals {​​​​​
	public static void main(String[] args) {​​​​​
		MyDate date1 = new MyDate(14, 3, 1976);
		MyDate date2 = new MyDate(14, 3, 1976);
		if ( date1 == date2 ) {​​​​​
			System.out.println("Date1 is identical to Date2");
		}​​​​​ else {​​​​​
			System.out.println("Date1 is not identical to Date2");
		}​​​​​
	
		if ( date1.equals(date2) ) {​​​​​
			System.out.println("Date1 is equal to Date2");
		}​​​​​ else {​​​​​
			System.out.println("Date1 is not equal to Date2");
		}​​​​​
	
		System.out.println("set Date2 = Date1;");
		date2 = date1;
		if ( date1 == date2 ) {​​​​​
			System.out.println("Date1 is identical to Date2");
		}​​​​​ else {​​​​​
		System.out.println("Date1 is not identical to Date2");
​​​​​
		}​​​​​
	}​​​​​
}
