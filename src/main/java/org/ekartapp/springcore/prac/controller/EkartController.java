package org.ekartapp.springcore.prac.controller;

import java.util.List;

import org.ekartapp.springcore.prac.model.OrderTable;
import org.ekartapp.springcore.prac.service.IEkartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/id")
public class EkartController {
	
	@Autowired
	IEkartService iService;
	
	@PostMapping("/placeOrder")
	public String placeOrder(@RequestBody List<OrderTable> request) {
		String u1=iService.placeOrder(request);
		return u1;
	}
	
	
	
	@GetMapping("/id1/{userId}")
	public ResponseEntity<List<OrderTable>> getProduct(@PathVariable("userId") Integer orderId ) {
		List<OrderTable> u1=iService.getProduct(orderId);
		
		return new ResponseEntity<List<OrderTable>>(u1,HttpStatus.OK);
	}

}
