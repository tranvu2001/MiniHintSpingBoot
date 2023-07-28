package demo.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "orderId", columnDefinition = "serial")
	private Long orderId;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "phone")
	private Integer phone;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "productName")
	private String productName;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "status")
	private String status;

	public Orders() {
		
	}

	public Orders(Long orderId, String email, String name, Integer phone, String address, String productName,
			Double price, int quantity, String image, String status) {
		this.orderId = orderId;
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.image = image;
		this.status = status;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", email=" + email + ", name=" + name + ", phone=" + phone + ", address="
				+ address + ", productName=" + productName + ", price=" + price + ", quantity=" + quantity + ", image="
				+ image + ", status=" + status + "]";
	}

	
	
	
	
	
	
	
}
