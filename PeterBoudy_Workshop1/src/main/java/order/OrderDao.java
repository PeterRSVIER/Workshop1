package order;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderDao {

	public void createOrder(List<Order> orderList);
	public void updateOrder(List<Order> orderList); 
	public void deleteOrder(List<Order> orderList); 		
	public void getOrdersByCustId(int customerId); 	
	public void getOrdersByDate(LocalDateTime date);
	public void getOrderById(int id);
	
}
