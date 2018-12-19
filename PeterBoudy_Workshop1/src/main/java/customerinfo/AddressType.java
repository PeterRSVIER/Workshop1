package customerinfo;

public enum AddressType {

	RESIDENCE("Residence address"),//woonadres
	BILLING("Billing address"),//factuuradres
	DELIVERY("Delivery address")//leveradres
	;
	
	private String description;
	
	private AddressType(String description) {
		this.description = description;
	}

    protected String getDescription() {
    	return description;
    }
}
