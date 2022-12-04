package com.BookStore.App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BookStore.App.model.orders;
import com.BookStore.App.service.OrdersServiceImpl;

@RestController
public class OrdersController {
 @Autowired
 private OrdersServiceImpl orderrepo;
 
 @PostMapping("/orders")
 private ResponseEntity<orders> placeorder(@RequestBody orders order){
	 return ResponseEntity.ok().body(this.orderrepo.bookorder(order));
 }
 
 @PutMapping("/orders/return/{id}")
 private ResponseEntity<String> returnbook(@PathVariable long id) {
	 this.orderrepo.returnbook(id);
	 return ResponseEntity.ok().body("Book Successfully Returned");
 }
}
