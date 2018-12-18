package order;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderDao {

	public void createOrder(List<Order> orderList);
	public void updateOrder(List<Order> orderList); 
	public void deleteOrder(List<Order> orderList); 		
	public List<Order> getOrdersByCustId(int customerId); 	
	public List<Order> getOrdersByDate(LocalDateTime date);
	public Order getOrderById(int id);
	
}
