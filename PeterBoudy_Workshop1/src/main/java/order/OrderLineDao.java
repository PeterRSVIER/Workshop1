package order;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderLineDao {

	public void createOrderLine(List<OrderLine> orderLineList) {
	  String query = "INSERT INTO orderline (orderId, productId, amount) VALUES( ?, ?, ?)"; 
	  try {
	    ConnectDatabase conn = new ConnectDatabase(); 
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		for (OrderLine orderLine : orderLineList) { 
				preparedStatement.setOrderInt(1, orderLine.getOrderId());
				preparedStatement.setOrderInt(2, orderLine.getProductId()); 
				preparedStatement.setInt(3, orderLine.getAmount());
				preparedStatement.executeUpdate(); 
	  	    } 
		    logger.log(Level.INFO, "Orderline successfully created"); 
		  } 
		  catch (SQLException e) { 
		    logger.log(Level.WARNING, "SQL exception ocurred.", e); 
		  } 
	    }
			  
	public void updateOrderLine(List<OrderLine> orderLineList) { 
	  String query = "UPDATE orderline set amount = ? WHERE orderId = ? and productId = ?"; 
	  try {
		ConnectDatabase conn = new ConnectDatabase(); 
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		for (OrderLine orderLine : orderLineList) { 
		  preparedStatement.setInt(1, orderLine.getAmount());
		  preparedStatement.setOrderInt(2, orderLine.getOrderId());
		  preparedStatement.setOrderInt(3, orderLine.getProductId()); 
 		  preparedStatement.executeUpdate(); 
		} 
		logger.log(Level.INFO, "Orderline successfully updated"); 
	  } 
	  catch (SQLException e) { 
	    logger.log(Level.WARNING, "SQL exception ocurred.", e); 
	  } 
	}

	public void deleteOrderLine(List<OrderLine> orderLineList) {
	  String query = "DELETE orderline WHERE orderId = ? and productId = ?"; 
	  try {
		ConnectDatabase conn = new ConnectDatabase(); 
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		for (OrderLine orderLine : orderLineList) { 
			  preparedStatement.setOrderInt(1, orderLine.getOrderId());
			  preparedStatement.setOrderInt(2, orderLine.getProductId()); 
			  preparedStatement.executeUpdate(); 
	    } 
        logger.log(Level.INFO, "Order successfully removed"); 
	  } 
	  catch (SQLException e) { 
		logger.log(Level.WARNING, "SQL exception ocurred.", e); 
	  } 
   }
				
   public List<OrderLine> getOrderLinesByOrderId(int orderId) {
	 String query = "SELECT orderId, productId, amount from orderline WHERE orderId = ?"; 
	 try {
	   ConnectDatabase conn = new ConnectDatabase(); 
	   PreparedStatement preparedStatement = conn.prepareStatement(query);
	   preparedStatement.setInt(1, orderId); 
	   preparedStatement.executeUpdate(); 
	   logger.log(Level.INFO, "Orders successfully retrieved"); 
	 } 
	 catch (SQLException e) { 
	   logger.log(Level.WARNING, "SQL exception ocurred.", e); 
	 } 
   }
				
}
