package project8_26jun;

public class Location {
	private String locationId;
	private String city;
	private int zipCode;
	private String country;

	public Location() {
	}

	public Location(String locationId, String city, int zipCode, String countryName) {
		this.locationId = locationId;
		this.city = city;
		this.zipCode = zipCode;
		this.country = countryName;
	}
	
	
	public String getDetails() {	
		return "Location ID: "+locationId+" City: "+city+" Zipcode: "+zipCode+" Country Name: "+country;
	}
}