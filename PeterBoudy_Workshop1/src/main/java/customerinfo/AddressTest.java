package customerinfo;

public class AddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Address address1 = new Address.Builder()
		.id(1)
		.addressType("Residence")
		.customerId(1)
		.street("Dokter van Stratenweg")
		.houseNumber(327)
		.houseExtension("")
        .zipCode("4205LE")
		.city("Gorinchem")
		.country("Netherlands")
		.build();
		System.out.println(address1); 
		
		AddressDaoImpl address1_adi = new AddressDaoImpl();
//		address1_adi.createAddressType("Residence");
		address1_adi.createAddress(address1);

		Address address2 = new Address.Builder()
		.id(2)
		.addressType("Residence")
		.customerId(2)
		.street("Frans Halsstraat")
		.houseNumber(77)
		.houseExtension("A-2")
        .zipCode("1072BN")
		.city("Amsterdam")
		.country("Netherlands")
		.build();
		System.out.println(address2); 

		AddressDaoImpl address2_adi = new AddressDaoImpl();
		address2_adi.createAddress(address2);

	}

}
