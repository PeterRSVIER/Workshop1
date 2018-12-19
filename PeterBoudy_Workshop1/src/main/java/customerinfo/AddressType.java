package customerinfo;

public class AddressType {

	private final String RESIDENCE = "Residence address";//woonadres
	private final String BILLING = "Billing address";//factuuradres
	private final String DELIVERY = "Delivery address";//leveradres
	private final int id;
	private String description;
	
	protected AddressType(int id, String description) {
		this.id = id;
		this.description = description;
		if (description != RESIDENCE && description != BILLING && description != DELIVERY)
		System.out.println("Please use one of the three values " + RESIDENCE + ", " + BILLING + " or " + DELIVERY);
	}

    private int getId() {
    	return id;
    }

    private String getDescription() {
    	return description;
    }
}
