package org.ekartapp.springcore.prac.service;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.ekartapp.springcore.prac.dao.OrderDao;
import org.ekartapp.springcore.prac.dao.ProductDao;
import org.ekartapp.springcore.prac.dao.UserDao;
import org.ekartapp.springcore.prac.exception.EmailIdException;
import org.ekartapp.springcore.prac.exception.OrderIdIsNotPresentException;
import org.ekartapp.springcore.prac.model.OrderTable;
import org.ekartapp.springcore.prac.model.UserTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EkartServiceImpl implements IEkartService {
	
	
	@Autowired
	OrderDao eDao;
	
	@Autowired
	ProductDao pDao;
	
	@Autowired
	UserDao uDao;
	
	Logger LOGGER=LoggerFactory.getLogger("EkartServiceImpl.class");

	

	

	@Override
	public String placeOrder(List<OrderTable> request) {
		eDao.saveAll(request);
		return "sucess";
	}


	@Override
	public List<OrderTable> getProduct(Integer orderId) {
		LOGGER.info("retrieving order{}", orderId);
		Optional<OrderTable> orderRecord=eDao.findById(orderId);
		if(!orderRecord.isPresent()) {
			throw new  OrderIdIsNotPresentException("userID doesnt exist in db");
		}
		
		
		OrderTable info=orderRecord.get();
		UserTable info1=info.getUserTable();
		
		
		//EmailId
		
		Pattern p = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}");
		Matcher m = p.matcher(info1.getEmailId());
		
		if (!m.find()) {
			throw new EmailIdException("invalid EMailId");
		}
					
		LOGGER.info("retrieving user{}",eDao.findAll());
		return eDao.findAll();
	}


}
