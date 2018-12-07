package rsvier.workshop1;

import java.math.BigDecimal;

public class Product {
	private String productName;
	private int productId
	,           stock;//#of this product in stock
	private BigDecimal price;  //instead of BigNumber

    private Product(){
    }

    private Product(String productName, int productId, BigDecimal price, int stock) {
      this.productName = productName;
      this.productId = productId;
      this.price = price;
      this.stock = stock;
    }

	public String getProductName() {return productName;}
	public int getProductId() {return productId;}
    public BigDecimal getPrice() {return price;}
	public int getStock() {return stock;}

	public void setProductName(String productName) {this.productName = productName;}
	public void setPrice(BigDecimal price) {this.price = price;}
	public void setStock(int stock) {this.stock = stock;}

	public Product searchProduct(int productId) {return this;}
	public Product searchProduct(String productName) {return this;}
}
