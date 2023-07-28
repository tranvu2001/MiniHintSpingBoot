package demo.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "brands")
public class Brands {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "brandId", columnDefinition = "serial")
	private Long brandId;
	
	@Column(name = "brandName")
	private String brandName;

	@Column(name = "brandImage")
	private String brandImage;

	
	
	public Brands() {

	}



	public Brands(String brandName, String brandImage) {

		this.brandName = brandName;
		this.brandImage = brandImage;
	}



	public Long getBrandId() {
		return brandId;
	}



	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}



	public String getBrandName() {
		return brandName;
	}



	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}



	public String getBrandImage() {
		return brandImage;
	}



	public void setBrandImage(String brandImage) {
		this.brandImage = brandImage;
	}



	@Override
	public String toString() {
		return "Brands [brandId=" + brandId + ", brandName=" + brandName + ", brandImage=" + brandImage + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
