package project9_26jun;

public class Location {

	private String locationId;
	private String city;
	private int pincode;
	private String country;

	public Location() {}
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pincode;
	}
	public void setPinCode(int pincode) {
		this.pincode = pincode;
	}

	public String getCountryName() {
		return country;
	}
	public void setCountryName(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Location [LocationId:" +locationId+ ", City:" +city+ ", Pincode:" +pincode+ ", CountryName:"
				+country+ "]";
	}
}