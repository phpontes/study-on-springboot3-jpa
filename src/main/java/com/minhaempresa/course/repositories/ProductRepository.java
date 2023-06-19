package com.minhaempresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaempresa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
