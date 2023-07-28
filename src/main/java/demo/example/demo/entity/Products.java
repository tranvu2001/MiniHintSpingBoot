package demo.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "productId", columnDefinition = "serial")
	private Long productId;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="slugName")
	private String slugName;
	
	@Column(name="productImage")
	private String productImage;
	
	@Column(name="productImage2")
	private String productImage2;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="categoryId")
	private Integer categoryId;
	
	@Column(name="brandId")
	private Integer brandId;
	
	@Column(name="discountPercent")
	private Integer discountPercent;
	
	@Column(name="rating")
	private BigDecimal rating;
	
	
	
	public Products() {
		
	}

	

	public Products(String productName, String slugName, String productImage, String productImage2, String description, Double price,
			Integer categoryId, Integer brandId, Integer discountPercent, BigDecimal rating) {
		this.productName = productName;
		this.slugName = slugName;
		this.productImage = productImage;
		this.productImage2 = productImage2;
		this.description = description;
		this.price = price;
		this.categoryId = categoryId;
		this.brandId = brandId;
		this.discountPercent = discountPercent;
		this.rating = rating;
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



	public String getSlugName() {
		return slugName;
	}



	public void setSlugName(String slugName) {
		this.slugName = slugName;
	}



	public String getProductImage() {
		return productImage;
	}



	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	
	public String getProductImage2() {
		return productImage2;
	}



	public void setProductImage2(String productImage2) {
		this.productImage2 = productImage2;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public Integer getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}



	public Integer getBrandId() {
		return brandId;
	}



	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}



	public Integer getDiscountPercent() {
		return discountPercent;
	}



	public void setDiscountPercent(Integer discountPercent) {
		this.discountPercent = discountPercent;
	}



	public BigDecimal getRating() {
		return rating;
	}



	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}



	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", slugName=" + slugName
				+ ", productImage=" + productImage + ", productImage2=" + productImage2 + ", description=" + description
				+ ", price=" + price + ", categoryId=" + categoryId + ", brandId=" + brandId + ", discountPercent="
				+ discountPercent + ", rating=" + rating + "]";
	}



	




	
	
	
}
