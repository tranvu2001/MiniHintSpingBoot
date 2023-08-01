package demo.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.example.demo.entity.Orders;
import demo.example.demo.repository.OrdersRepository;

@CrossOrigin(origins ="https://mini-hint-react-js.vercel.app/")
//@CrossOrigin("*")
@RestController
@RequestMapping(path = "/orders")
public class OrderController {
	@Autowired
	private OrdersRepository orderRepository;
	
	@GetMapping
	public List<Orders> findAllOrders() {
		return orderRepository.findAll();
	}
	
	@PostMapping
	public Orders saveOrder (@RequestBody Orders order) {
		return orderRepository.save(order);
	}
	
	@PutMapping("/{id}")
	public Orders updateOrder (@PathVariable Long id, @RequestBody Orders orders) {
		Orders order = orderRepository.findById(id).orElseThrow();
		order.setEmail(orders.getEmail());
		order.setName(orders.getName());
		order.setPhone(orders.getPhone());
		order.setAddress(orders.getAddress());
		order.setProductName(orders.getProductName());
		order.setPrice(orders.getPrice());
		order.setQuantity(orders.getQuantity());
		order.setImage(orders.getImage());
		order.setStatus(orders.getStatus());
		
		Orders updateOrder = orderRepository.save(order);
		return updateOrder;
	}
	
	@PatchMapping("/{id}/{status}")
	public Orders updateStatus(@PathVariable Long id, @PathVariable String status){
		Orders order = orderRepository.findById(id).orElseThrow();
		order.setStatus(status);
		return orderRepository.save(order);
	}
	
	@DeleteMapping("/{id}")
	public void deleteOrder(@PathVariable("id") Long id) {
		orderRepository.deleteById(id);
	}
	
	
	
	
	
	
	
}
