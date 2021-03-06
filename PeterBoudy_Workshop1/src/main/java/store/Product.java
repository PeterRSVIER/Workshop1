package store;

import java.math.BigDecimal;

public class Product {

	private String productName;
	private int id;
	private int stock;//#of this product in stock
	private BigDecimal price;  //instead of BigNumber

    public Product(String productName, int id, BigDecimal price, int stock) {
      this.productName = productName;
      this.id = id;
      this.price = price;
      this.stock = stock;
    }

	public String getProductName() {
		return productName;
		}

	public int getId() {
		return id;
		}

	public BigDecimal getPrice() {
		return price;
		}

	public int getStock() {
		return stock;
		}

	public void setProductName(String productName) {
		this.productName = productName;
		}

	public void setPrice(BigDecimal price) {
		this.price = price;
		}

	public void setStock(int stock) {
		this.stock = stock;
		}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Product other = (Product) obj;
//		if (productName == null) {
//			if (other.productName != null)
//				return false;
//		} else if (!productName.equals(other.productName))
//			return false;
//		return true;
//}

}

