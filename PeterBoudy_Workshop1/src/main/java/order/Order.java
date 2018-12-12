package rsvier.workshop1;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

public class Order {

  private final int orderId;
  private BigDecimal totalCost;
  private LocalDateTime date;
  private final int customerId;
  private String status;
  
  public Order(int orderId, BigDecimal totalCost, LocalDateTime date, int customerId, String status) {
	  this.orderId = orderId;
	  this.totalCost = totalCost;
	  this.date = date;
	  this.customerId = customerId;
	  this.status = status;
  }

  public int getOrderId() {
	  return orderId;
	  }

  public BigDecimal	getTotalCost() {
	  return totalCost;
	  }

  public LocalDateTime getDate() {
	  return date;
	  }

  public int getCustomerId(){
	  return customerId;
	  }

  public String getStatus() {
	  return status;
  }

  public void setDate(LocalDateTime date) {
	  this.date = date;
	  }

  public BigDecimal	calculateTotalCost() {
	  return totalCost;
	  }//calculation TBD

  public void setStatus(String status) {
	this.status = status;  
  }

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + customerId;
	result = prime * result + ((date == null) ? 0 : date.hashCode());
	result = prime * result + ((status == null) ? 0 : status.hashCode());
	result = prime * result + ((totalCost == null) ? 0 : totalCost.hashCode());
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
	Order other = (Order) obj;
	if (customerId != other.customerId)
		return false;
	if (date == null) {
		if (other.date != null)
			return false;
	} else if (!date.equals(other.date))
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	if (totalCost == null) {
		if (other.totalCost != null)
			return false;
	} else if (!totalCost.equals(other.totalCost))
		return false;
	return true;
}

}
