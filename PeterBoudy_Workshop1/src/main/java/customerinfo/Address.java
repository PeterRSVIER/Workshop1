package customerinfo;

	public class Address {
		private final int 		id;
		private final int 		customerId;
		private final int 		houseNumber;

		private final int    addressTypeId;
		private final String 	street;
		private final String 	houseExtension;
		private final String	zipCode;
		private final String	city;
		private final String	country;
		
//		Start of Address-Getters
		public int getId() {
			return id;
		}
		
		public int getCustomerId() {
			return customerId;
		}

		public int getAddressTypeId() {
			return addressTypeId;
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
		this.addressTypeId = builder.addressTypeId;
		this.id = builder.id;
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
		id + " "
		+ customerId + " "
		+ addressTypeId + " "
		+ ((street != null) ? street + " ": "")
		+ (Integer.toString(houseNumber) !="0" ? Integer.toString(houseNumber) + " ": "")
		+ ((houseExtension != null) ? houseExtension + " ": "")
		+ ((zipCode != null) ? zipCode + " ": "")
		+ ((city != null) ? city + " ": "")
		+ ((country != null) ? country + " ": "");
		
		}
		
		public static class Builder {
		private int 	id;
		private int 	houseNumber;
		private int		customerId;
		private int 	addressTypeId;
		private String	street;
		private String	houseExtension;
		private String	zipCode;
		private String	city;
		private String	country;
		
		public Builder customerId(int customerId) {
		this.customerId = customerId;
		return this;
		}
		
		public Builder addressTypeId(int addressTypeId) {
		this.addressTypeId = addressTypeId;
		return this;
		}
		
		public Builder id(int id) {
		this.id = id;
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
	}
// 		End of AddressBuilder
// 		Start of AddressBuilder Implementation	
//		Address address = new Address.Builder()
//		.addressId(11111)
//		.addressType("AddressTypeInput")
//		.customerId(333333)
//		.street("Dokter van Stratenweg")
//		.houseNumber(327)
//		.houseExtension("")
//		.zipCode("4205LE")
//		.city("Gorinchem")
//		.country("Nederland")
//		.build();
//		System.out.println(address); 
//		
//		
//		}
//	}
//		End of AddressBuilder implementation