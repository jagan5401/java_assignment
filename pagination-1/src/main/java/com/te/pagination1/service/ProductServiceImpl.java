package com.te.pagination1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.te.pagination1.Product;
import com.te.pagination1.repositary.ProductRepositary;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepositary repositary;
	@Override
	public List<Product> findAllData() {

		
		return repositary.findAll();
	}
	@Override
	public List<Product> findDatabyField(String field) {
		// TODO Auto-generated method stub
		return repositary.findAll(Sort.by(Sort.Direction.ASC));
	}
	@Override
	public Page<Product> findDatapagination(int offset, int pagesize) {
Page<Product> findAll = repositary.findAll(PageRequest.of(offset, pagesize));
		
		return findAll;
	}
	@Override
	public Page<Product> findDatapaginationWithField(int offset, int pagesize, String field) {

		return repositary.findAll(PageRequest.of(offset, pagesize).withSort(Sort.by(field)));
	}

}
