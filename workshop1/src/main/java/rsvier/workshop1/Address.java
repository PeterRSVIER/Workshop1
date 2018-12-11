package rsvier.workshop1;
import java.sql.*;

	public class Address {
		private final int 		addressId,
								customerId,
								houseNumber;

		private final String 	addressType,
								street,
								houseExtension,
								zipCode,
								city,
								country;
		
//		Start of Address-Getters
		public int getAddressId() {
			return addressId;
		}
		
		public int getCustomerId() {
			return customerId;
		}

		public String getAddressType() {
			return addressType;
		}
		
		public String getStreet() {
			return street;
		}

		public int getHouseNumber() {
			return houseNumber;
		}

		public String getHouseExtension() {
			return houseExtension;
		}
		
		public String getZipCode() {
			return zipCode;
		}
		
		public String getCity() {
			return city;
		}
		
		public String getCountry() {
			return country;
		}
//		End of Address-Getters
//		Start of AddressBuilder
		private Address(Builder builder) {
		this.customerId = builder.customerId;
		this.addressType = builder.addressType;
		this.addressId = builder.addressId;
		this.street = builder.street;
		this.houseNumber = builder.houseNumber;
		this.houseExtension = builder.houseExtension;
		this.zipCode = builder.zipCode;
		this.city = builder.city;
		this.country = builder.country;
		}
		
		@Override
		public String toString() {
		return 
		addressId + " "
		+ customerId + " "
		+ addressType + " "
		+ ((street != null) ? street + " ": "")
		+ (Integer.toString(houseNumber) !="0" ? Integer.toString(houseNumber) + " ": "")
		+ ((houseExtension != null) ? houseExtension + " ": "")
		+ ((zipCode != null) ? zipCode + " ": "")
		+ ((city != null) ? city + " ": "")
		+ ((country != null) ? country + " ": "");
		
		}
		
		public static class Builder {
		private int 	addressId,
						houseNumber,
						customerId;
		private String 	addressType,
						street,
						houseExtension,
						zipCode,
						city,
						country;
		
		public Builder customerId(int customerId) {
		this.customerId = customerId;
		return this;
		}
		
		public Builder addressType(String addressType) {
		this.addressType = addressType;
		return this;
		}
		
		public Builder addressId(int addressId) {
		this.addressId = addressId;
		return this;
		}
		
		public Builder street(String street) {
		this.street = street;
		return this;
		}
		
		public Builder houseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
		return this;
		}
		
		public Builder houseExtension(String houseExtension) {
		this.houseExtension = houseExtension;
		return this;
		}
		
		public Builder zipCode(String zipCode) {
		this.zipCode = zipCode;
		return this;
		}
		
		public Builder city(String city) {
		this.city = city;
		return this;
		}
		
		public Builder country(String country) {
		this.country = country;
		return this;
		}
		
		public Address build() {
		return new Address(this);
		}
		}
// 		End of AddressBuilder
// 		Start of AddressBuilder Implementation
		public static void main(String[] args) {
			
		Connection connection = new DriverManager.getConnection	("jbdc:mysql://localhost/pb_workshop1", "root", "rsvier");
		Address address = new Address.Builder()
		.addressId(11111)
		.addressType("AddressTypeInput")
		.customerId(333333)
		.street("Dokter van Stratenweg")
		.houseNumber(327)
		.houseExtension("")
		.zipCode("4205LE")
		.city("Gorinchem")
		.country("Nederland")
		.build();
		System.out.println(address); 
		
		
		}
	}
//		End of AddressBuilder implementation