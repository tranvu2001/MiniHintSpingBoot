package demo.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.example.demo.entity.Brands;

public interface BrandsRepository extends JpaRepository<Brands, Long>{

}
