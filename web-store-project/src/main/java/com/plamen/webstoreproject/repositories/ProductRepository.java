package com.plamen.webstoreproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plamen.webstoreproject.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
