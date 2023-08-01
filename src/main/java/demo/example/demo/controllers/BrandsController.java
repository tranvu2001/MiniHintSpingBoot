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

import demo.example.demo.entity.Brands;
import demo.example.demo.repository.BrandsRepository;

//@CrossOrigin(origins ="http://localhost:3000")
@CrossOrigin("*")
@RestController
@RequestMapping(path = "/brands")
public class BrandsController {
	@Autowired
	private BrandsRepository brandsRepository;
	
	@GetMapping
	public List<Brands> findAllBrands() {
		return brandsRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Brands findById(@PathVariable("id") Long id) {
		Brands brand = brandsRepository.findById(id)
				.orElseThrow();
		return brand;
	}
	
	@PostMapping
	public Brands saveBrand(@RequestBody Brands brand) {
		return brandsRepository.save(brand);
	}
	
	@PutMapping("/{id}")
	public Brands updateBrand(@PathVariable Long id, @RequestBody Brands brands) {
		Brands brand = brandsRepository.findById(id)
				.orElseThrow();
		brand.setBrandName(brands.getBrandName());
		brand.setBrandImage(brands.getBrandImage());
		
		Brands updatedBrand = brandsRepository.save(brand);
		return updatedBrand;
	}
	
	@DeleteMapping("/{id}")
	public void deleteBrand(@PathVariable("id") Long id) {
		brandsRepository.deleteById(id);
	}
	
	
	
	
	
}
