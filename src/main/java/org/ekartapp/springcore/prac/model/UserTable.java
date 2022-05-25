package org.ekartapp.springcore.prac.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Table")
public class UserTable  {
	@Id
	@Column(name="UserName")
	private String emailId;
	
	@Column(name="Password")
	private String passWord;
	
	@OneToOne(mappedBy="userTable")
	private OrderTable orderTable;

	public UserTable(String emailId, String passWord, OrderTable orderTable) {
		super();
		this.emailId = emailId;
		this.passWord = passWord;
		this.orderTable = orderTable;
	}

	public UserTable() {
		super();
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public OrderTable getOrderTable() {
		return orderTable;
	}

	public void setOrderTable(OrderTable orderTable) {
		this.orderTable = orderTable;
	}

	@Override
	public String toString() {
		return "UserTable [emailId=" + emailId + ", passWord=" + passWord + ", orderTable=" + orderTable + "]";
	}

	
	

}
