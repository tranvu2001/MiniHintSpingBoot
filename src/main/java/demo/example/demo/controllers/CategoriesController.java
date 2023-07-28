package demo.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.example.demo.entity.Categories;
import demo.example.demo.entity.Products;
import demo.example.demo.repository.CategoriesRepository;


@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping(path = "/categories")
public class CategoriesController {
	
	@Autowired
	private CategoriesRepository categoriesRepository;
	
	@GetMapping
	public List<Categories> findAllEmployees() {
		return categoriesRepository.findAll();
	} 
	
	@GetMapping("/{id}")
	public Categories findById(@PathVariable("id") Long id) {
		Categories categories = categoriesRepository.findById(id)
				.orElseThrow();
		return categories;
	}
	
	@PostMapping
	public Categories saveCategory(@RequestBody Categories categories) {
		return categoriesRepository.save(categories);
	}
	
	
	@PutMapping("/{id}")
	public Categories updateCategory(@PathVariable Long id ,@RequestBody Categories categories) {
		Categories category = categoriesRepository.findById(id)
				.orElseThrow();
		category.setCategoryName(categories.getCategoryName());
		category.setCategoryImage(categories.getCategoryImage());
		
		
		Categories updatedCategory = categoriesRepository.save(category);
		return updatedCategory;
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable("id") Long id) {
		categoriesRepository.deleteById(id);
	}
	
	
}
