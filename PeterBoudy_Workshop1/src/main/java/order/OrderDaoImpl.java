package order;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import connection.Login;


public class OrderDaoImpl implements OrderDao{

private static final Logger LOG = LoggerFactory.getLogger(OrderDaoImpl.class);
	
		public void createOrder(List<Order> orderList) {
		  String query = "INSERT INTO order (id, totalCost, date, customerId, status) VALUES( ?, ?, ?, ?, ?)"; 
		  try {
				Login.createconnection();
				Statement statement = Login.connection.createStatement();
			PreparedStatement preparedStatement = Login.connection.prepareStatement(query);
			for (Order order : orderList) { 
			    	  //int id, BigDecimal totalCost, LocalDateTime date, int customerId, String status
				preparedStatement.setInt(1, order.getId());
				preparedStatement.setBigDecimal(2, order.getTotalCost()); 
				preparedStatement.setDate(3, order.getDate()); 
				preparedStatement.setInt(4, order.getCustomerId());
				preparedStatement.setString(5, order.getStatus());
				preparedStatement.executeUpdate(); 
	  	    } 
		    LOG.info("Order successfully created"); 
		  } 
		  catch (SQLException e) { 
		  e.printStackTrace();
		  } 
	    }
			  
		public void updateOrder(List<Order> orderList) { 
		  String query = "UPDATE order set totalCost = ?, date = ?, customerId = ?, status = ? WHERE id = ?"; 
		  try {
			Login.createconnection();
			Statement statement = Login.connection.createStatement();
			PreparedStatement preparedStatement = Login.connection.prepareStatement(query);
			for (Order order : orderList) { 
			  preparedStatement.setBigDecimal(1, order.getTotalCost()); 
			  preparedStatement.setDate(2, order.getDate()); 
			  preparedStatement.setInt(3, order.getCustomerId());
			  preparedStatement.setString(4, order.getStatus());
			  preparedStatement.setInt(5, order.getId());
			  preparedStatement.executeUpdate(); 
		    } 
			LOG.info("Order successfully updated"); 
		  } 
		  catch (SQLException e) { 
		  e.printStackTrace();
		  } 
	    }

		public void deleteOrder(List<Order> orderList) {
		  String query = "DELETE order WHERE id = ?"; 
		  try {
			  Login.createconnection();
			  Statement statement = Login.connection.createStatement();
			  PreparedStatement preparedStatement = Login.connection.prepareStatement(query);
			for (Order order : orderList) { 
			  preparedStatement.setInt(1, order.getId()); 
			  preparedStatement.executeUpdate(); 
		    } 
		    LOG.info("Order successfully removed"); 
		  } 
		  catch (SQLException e) { 
		  e.printStackTrace();
		  } 
	    }
				
		  public void getOrdersByCustId(int customerId) {
			String query = "SELECT id, totalCost, date, customerId, status from order WHERE customerId = ?"; 
			try {
			  Login.createconnection();
			  Statement statement = Login.connection.createStatement();
			  PreparedStatement preparedStatement = Login.connection.prepareStatement(query);
			  preparedStatement.setInt(1, customerId); 
			  preparedStatement.executeUpdate(); 
			  LOG.info("Orders successfully retrieved"); 
			} 
			catch (SQLException e) { 
			e.printStackTrace(); 
			} 
		  }
				
		  public void getOrdersByDate(Date date) {
			String query = "SELECT id, totalCost, date, customerId, status from order WHERE date = ?"; 
			try {
			  Login.createconnection();
			  Statement statement = Login.connection.createStatement();
			  PreparedStatement preparedStatement = Login.connection.prepareStatement(query);
			  preparedStatement.setDate(1, date); 
			  preparedStatement.executeUpdate(); 
			  LOG.info("Orders successfully retrieved"); 
			} 
			catch (SQLException e) { 
		    e.printStackTrace(); 
			} 
		  }

		  public void getOrderById(int id) {
				String query = "SELECT id, totalCost, date, customerId, status from order WHERE id = ?"; 
				try {
			      Login.createconnection();
			      Statement statement = Login.connection.createStatement();
				  PreparedStatement preparedStatement = Login.connection.prepareStatement(query);
				  preparedStatement.setInt(1, id); 
				  preparedStatement.executeUpdate(); 
				  LOG.info("Order successfully retrieved"); 
				} 
				catch (SQLException e) { 
			    e.printStackTrace(); 
				} 
			  }

	}
