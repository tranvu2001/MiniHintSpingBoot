package demo.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.example.demo.entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long>{
	
}
