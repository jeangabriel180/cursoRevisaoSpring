package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//herda de JPA repository por isso não precisa de annotation
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
