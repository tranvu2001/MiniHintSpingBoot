package demo.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.example.demo.entity.Products;
import demo.example.demo.repository.ProductsRepository;



@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping(path = "/products")
public class ProductController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@Autowired
//	private ProductsService productService;
	private ProductsRepository productsRepository;
	
	
	
	@GetMapping
	public List<Products> findAllEmployees() {
		return productsRepository.findAll();
	} 
	
	@GetMapping("/{id}")
	public Products findById(@PathVariable("id") Long id) {
		Products product = productsRepository.findById(id)
				.orElseThrow();
		return product;
	}
	
	@GetMapping("/detail/{slugName}")
	Optional<Products> findByslugName(@PathVariable String slugName) {
		return productsRepository.findByslugName(slugName);
	}
	
	@GetMapping("/search")
	public List<Products> findAll(@RequestParam Optional<String> productName) {
		return productsRepository.findByName(productName.orElse(null));
	}
	
	@PostMapping
	public Products saveProducts (@RequestBody Products products) {
		return productsRepository.save(products);
	}
	
	@PutMapping("/{id}")
	public Products updateEmployee(@PathVariable Long id ,@RequestBody Products products) {
		Products product = productsRepository.findById(id)
				.orElseThrow();
		product.setProductName(products.getProductName());
		product.setSlugName(products.getSlugName());
		product.setProductImage(products.getProductImage());
		product.setProductImage2(products.getProductImage2());
		product.setDescription(products.getDescription());
		product.setPrice(products.getPrice());
		product.setCategoryId(products.getCategoryId());
		product.setBrandId(products.getBrandId());
		product.setDiscountPercent(products.getDiscountPercent());
		product.setRating(products.getRating());
		
		Products updatedProducts = productsRepository.save(product);
		return updatedProducts;
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") Long id) {
		productsRepository.deleteById(id);
	}
}