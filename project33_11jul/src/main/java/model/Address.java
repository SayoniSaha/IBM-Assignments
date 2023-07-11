package model;

public class Address {
	private String l1;
	private String l2;
	
	public Address(String line1, String line2) {
		super();
		this.l1 = line1;
		this.l2 = line2;
	}
	
	@Override
	public String toString() {
		return "Address [line1=" + l1 + ", line2=" + l2 + "]";
	}
}
