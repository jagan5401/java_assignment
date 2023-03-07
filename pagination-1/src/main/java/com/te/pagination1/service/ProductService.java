package com.te.pagination1.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.te.pagination1.Product;

public interface ProductService {

	public List<Product> findAllData();
	public List<Product> findDatabyField(String field);
	public Page<Product> findDatapagination(int offset,int pagesize);
	public Page<Product> findDatapaginationWithField(int offset,int pagesize,String field);
	
}
