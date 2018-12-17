package order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface OrderDao {

	public void createOrder(List<Order> orderList) {
	  String query = "INSERT INTO order (id, totalCost, date, customerId, status) VALUES( ?, ?, ?, ?, ?)"; 
	  try {
	    ConnectDatabase conn = new ConnectDatabase(); 
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		for (Order order : orderList) { 
		    	  //int id, BigDecimal totalCost, LocalDateTime date, int customerId, String status
			preparedStatement.setInt(1, order.getId());
			preparedStatement.setBigDecimal(2, order.getTotalCost()); 
			preparedStatement.setLocalDateTime(3, order.getDate()); 
			preparedStatement.setInt(4, order.getCustomerId());
			preparedStatement.setString(5, order.getStatus());
			preparedStatement.executeUpdate(); 
  	    } 
	    logger.log(Level.INFO, "Order successfully created"); 
	  } 
	  catch (SQLException e) { 
	    logger.log(Level.WARNING, "SQL exception ocurred.", e); 
	  } 
    }
		  
	public void updateOrder(List<Order> orderList) { 
	  String query = "UPDATE order set totalCost = ?, date = ?, customerId = ?, status = ? WHERE id = ?"; 
	  try {
		ConnectDatabase conn = new ConnectDatabase(); 
	    PreparedStatement preparedStatement = conn.prepareStatement(query);
		for (Order order : orderList) { 
		  preparedStatement.setBigDecimal(1, order.getTotalCost()); 
		  preparedStatement.setLocalDateTime(2, order.getDate()); 
		  preparedStatement.setInt(3, order.getCustomerId());
		  preparedStatement.setString(4, order.getStatus());
		  preparedStatement.setInt(5, order.getId());
		  preparedStatement.executeUpdate(); 
	    } 
		logger.log(Level.INFO, "Order successfully updated"); 
	  } 
	  catch (SQLException e) { 
	    logger.log(Level.WARNING, "SQL exception ocurred.", e); 
	  } 
    }

	public void deleteOrder(List<Order> orderList) {
	  String query = "DELETE order WHERE id = ?"; 
	  try {
		ConnectDatabase conn = new ConnectDatabase(); 
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		for (Order order : orderList) { 
		  preparedStatement.setInt(1, order.getId()); 
		  preparedStatement.executeUpdate(); 
	    } 
	    logger.log(Level.INFO, "Order successfully removed"); 
	  } 
	  catch (SQLException e) { 
		logger.log(Level.WARNING, "SQL exception ocurred.", e); 
	  } 
    }
			
	  public List<Order> getOrdersByCustId(int customerId) {
		String query = "SELECT id, totalCost, date, customerId, status from order WHERE customerId = ?"; 
		try {
		  ConnectDatabase conn = new ConnectDatabase(); 
		  PreparedStatement preparedStatement = conn.prepareStatement(query);
		  preparedStatement.setInt(1, customerId); 
		  preparedStatement.executeUpdate(); 
		  logger.log(Level.INFO, "Orders successfully retrieved"); 
		} 
		catch (SQLException e) { 
		  logger.log(Level.WARNING, "SQL exception ocurred.", e); 
		} 
	  }
			
	  public List<Order> getOrdersByDate(LocalDateTime date) {
		String query = "SELECT id, totalCost, date, customerId, status from order WHERE date = ?"; 
		try {
		  ConnectDatabase conn = new ConnectDatabase(); 
		  PreparedStatement preparedStatement = conn.prepareStatement(query);
		  preparedStatement.setLocalDateTimeInt(1, date); 
		  preparedStatement.executeUpdate(); 
		  logger.log(Level.INFO, "Orders successfully retrieved"); 
		} 
		catch (SQLException e) { 
		  logger.log(Level.WARNING, "SQL exception ocurred.", e); 
		} 
	  }

	  public Order getOrderById(int id) {
			String query = "SELECT id, totalCost, date, customerId, status from order WHERE id = ?"; 
			try {
			  ConnectDatabase conn = new ConnectDatabase(); 
			  PreparedStatement preparedStatement = conn.prepareStatement(query);
			  preparedStatement.setInt(1, id); 
			  preparedStatement.executeUpdate(); 
			  logger.log(Level.INFO, "Order successfully retrieved"); 
			} 
			catch (SQLException e) { 
			  logger.log(Level.WARNING, "SQL exception ocurred.", e); 
			} 
		  }

}
