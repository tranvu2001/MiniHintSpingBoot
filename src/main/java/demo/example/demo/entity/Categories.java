package demo.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "categories")
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "categoryId", columnDefinition = "serial")
	private Long categoryId;
	
	@Column(name = "categoryName")
	private String categoryName;

	@Column(name = "categoryImage")
	private String categoryImage;

	
	
	
	public Categories() {

	}




	public Categories(String categoryName, String categoryImage) {
		this.categoryName = categoryName;
		this.categoryImage = categoryImage;
	}




	public Long getCategoryId() {
		return categoryId;
	}




	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}




	public String getCategoryName() {
		return categoryName;
	}




	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}




	public String getCategoryImage() {
		return categoryImage;
	}




	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}




	@Override
	public String toString() {
		return "Categories [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryImage="
				+ categoryImage + "]";
	}
	
	


	


}
