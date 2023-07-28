package demo.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.example.demo.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long>{

}
