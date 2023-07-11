package model;

public class Person {

	private String firstName;
	private String lastName;
	private Address address;

	public Person(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
}


//<bean name="p" class="model.Person">
//<constructor-arg name="firstName" value="John"/>
//<constructor-arg name="lastName" value="Doe"/>
//<constructor-arg name="address" ref="a"/>
//</bean>
//
//<bean name="a" class="model.Address">
//<constructor-arg name="l1" value="Kolkata"/>
//<constructor-arg name="l2" value="India"/>
//</bean>