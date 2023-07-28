//package demo.example.demo.impl;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.stereotype.Service;
//
//import demo.example.demo.entity.Products;
//import demo.example.demo.repository.ProductsRepository;
//import demo.example.demo.service.ProductsService;
//
//
//
//@Service
//public class ProductsServiceImpl implements ProductsService{
//
//	private final ProductsRepository productsRepository;
//	
//	public ProductsServiceImpl(ProductsRepository employeeRepository) {
//		this.productsRepository = employeeRepository;
//	}
//	
//	@Override
//	public List<Products> findAllProducts() {
//		// TODO Auto-generated method stub
//		return productsRepository.findAll();
//	}
//
//	@Override
//	public Products findById(Long id) {
//		// TODO Auto-generated method stub
//		return productsRepository.findById(id)
//	}
//
//	@Override
//	public Products saveProducts(Products products) {
//		// TODO Auto-generated method stub
//		return productsRepository.save(products);
//	}
//
//	@Override
//	public Products updateProducts(Products products) {
//		// TODO Auto-generated method stub
//		return productsRepository.save(products);
//	}
//
//	@Override
//	public void deleteProduct(Long id) {
//		// TODO Auto-generated method stub
//		productsRepository.deleteById(id);
//	}
//	
//}
