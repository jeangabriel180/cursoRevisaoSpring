package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//herda de JPA repository por isso não precisa de annotation
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
