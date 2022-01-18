package com.gft.spring.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gft.spring.manager.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
