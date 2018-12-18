package store;

import java.math.BigDecimal;

public class main {

	public static void main(String[] args) {

		Product testproduct = new Product("testproduct1", 1, new BigDecimal("1.5"), 10);
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		productDaoImpl.createProduct(testproduct);

	}

}
