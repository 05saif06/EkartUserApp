package org.ekartapp.springcore.prac.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Product_Table")
public class ProductTable  {
	
	@Id
	@Column(name="Product_Id")
	private Long productId;
	
	@Column(name="Product_Name")
	private String productName;
	
	@OneToOne(mappedBy="productTable")
	private OrderTable orderTable;

	public ProductTable(Long productId, String productName, OrderTable orderTable) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.orderTable = orderTable;
	}

	public ProductTable() {
		super();
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public OrderTable getOrderTable() {
		return orderTable;
	}

	public void setOrderTable(OrderTable orderTable) {
		this.orderTable = orderTable;
	}

	@Override
	public String toString() {
		return "ProductTable [productId=" + productId + ", productName=" + productName + ", orderTable=" + orderTable
				+ "]";
	}
	
	

	
	

}
