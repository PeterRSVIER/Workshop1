package rsvier.workshop1;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

public class Order {

  private int orderNumber;
  private BigDecimal totalCost;
  private LocalDateTime date;
  private ArrayList<Product> products = new ArrayList<Product>();

  public Order() {
  }

  public Order(int orderNumber, BigDecimal totalCost, LocalDateTime date) {
	  this.orderNumber = orderNumber;
	  this.totalCost = totalCost;
	  this.date = date;
  }

  public int getOrderNumber() {return orderNumber;}
  public BigDecimal	getTotalCost() {return totalCost;}
  public LocalDateTime getDate() {return date;}
  public ArrayList<Product> getProducts(){return products;}

  public void setDate(LocalDateTime date) {this.date = date;}
  public BigDecimal	calculateTotalCost() {return totalCost;}//calculation TBD
  public void addProduct(Product product) {}
  public void removeProduct(Product product) {}

  public Order searchOrder(int orderNumber) {return this;}
  public ArrayList<Order> searchOrder(LocalDateTime date){ArrayList<Order> orders = new ArrayList<Order>(); return orders;}

}
