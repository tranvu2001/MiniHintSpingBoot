package demo.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import demo.example.demo.entity.Products;



public interface ProductsRepository extends JpaRepository<Products, Long>{
	Optional<Products> findByslugName(String slugName);
	
	@Query("SELECT s FROM Products s WHERE productName LIKE %?1%")
	List<Products> findByName(String productName);
}
