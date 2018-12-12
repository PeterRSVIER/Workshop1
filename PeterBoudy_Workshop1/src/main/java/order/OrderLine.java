package order;

public class OrderLine {

	private final int orderId
	,       productId;
	private int amount;

	public OrderLine(int orderId, int productId, int amount) {
		this.orderId = orderId;
		this.productId = productId;
		this.amount = amount;
	}

	public int getOrderId() {
		return orderId;
	}

	public int getProductId() {
		return productId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + productId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderLine other = (OrderLine) obj;
		if (amount != other.amount)
			return false;
		if (productId != other.productId)
			return false;
		return true;
	}
	
}
