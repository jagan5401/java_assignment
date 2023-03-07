package com.te.pagination1.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.pagination1.Product;
@Repository
public interface ProductRepositary extends JpaRepository<Product, Integer>{

}
