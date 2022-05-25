package org.ekartapp.springcore.prac.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Order_Table")
public class OrderTable  {
	
	
	
	@Id
	@Column(name="Order_Id")
	private int orderId;
	
	@Column(name="Product_Id")
	private Long productId;
	
	@Column(name="Delivery_Time")
	private String estimatedDeliveryTime;
	
	@Column(name="Order_Date")
	private String orderedDate;
	
	@Column(name="Created_BY")
	private Integer createdBy;
	
	@Column(name="Updated_BY")
	private Integer updatedBy;
	
	@OneToOne
	private UserTable userTable;
	
	@OneToOne
	private ProductTable productTable;

	public OrderTable(int orderId, Long productId, String estimatedDeliveryTime, String orderedDate, Integer createdBy,
			Integer updatedBy, UserTable userTable, ProductTable productTable) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.estimatedDeliveryTime = estimatedDeliveryTime;
		this.orderedDate = orderedDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.userTable = userTable;
		this.productTable = productTable;
	}

	public OrderTable() {
		super();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getEstimatedDeliveryTime() {
		return estimatedDeliveryTime;
	}

	public void setEstimatedDeliveryTime(String estimatedDeliveryTime) {
		this.estimatedDeliveryTime = estimatedDeliveryTime;
	}

	public String getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(String orderedDate) {
		this.orderedDate = orderedDate;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public UserTable getUserTable() {
		return userTable;
	}

	public void setUserTable(UserTable userTable) {
		this.userTable = userTable;
	}

	public ProductTable getProductTable() {
		return productTable;
	}

	public void setProductTable(ProductTable productTable) {
		this.productTable = productTable;
	}

	@Override
	public String toString() {
		return "OrderTable [orderId=" + orderId + ", productId=" + productId + ", estimatedDeliveryTime="
				+ estimatedDeliveryTime + ", orderedDate=" + orderedDate + ", createdBy=" + createdBy + ", updatedBy="
				+ updatedBy + ", userTable=" + userTable + ", productTable=" + productTable + "]";
	}
	
	

	
	
	
	

}
