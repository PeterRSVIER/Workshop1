package rsvier.workshop1;

	public class Address {
		private final int addressId;
		private final String street;
		private final int houseNumber;
		private final String houseExtension;
		private final String zipCode;
		private final String city;
		private final String country;
		
//		Start of AddressGetters
		public int getAddressId() {return addressId;
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
		
		public String getcity() {
			return city;
		}
		
		public String getCountry() {
			return country;
		}
//		End of AddressGetters

//		Start of AddressBuilder
		private Address(Builder builder) {
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
		+ ((street != null) ? street + " ": "")
		+ (Integer.toString(houseNumber) !="0" ? Integer.toString(houseNumber) + " ": "")
		+ ((houseExtension != null) ? houseExtension + " ": "")
		+ ((zipCode != null) ? zipCode + " ": "")
		+ ((city != null) ? city + " ": "")
		+ ((country != null) ? country + " ": "");
		}
		
		public static class Builder {
		private int addressId;
		private String street;
		private int houseNumber;
		private String houseExtension;
		private String zipCode;
		private String city;
		private String country;
		
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
		Address address = new Address.Builder()
		.addressId(11111)
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