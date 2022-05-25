package org.ekartapp.springcore.prac.service;

import java.util.List;
import org.ekartapp.springcore.prac.model.OrderTable;


public interface IEkartService {
	
	String placeOrder(List<OrderTable> request);
	
	
	
	List<OrderTable> getProduct(Integer orderId);
//	
//	String createProduct(OrderTable orderTable);

}
