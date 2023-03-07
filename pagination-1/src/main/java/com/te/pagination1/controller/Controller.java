package com.te.pagination1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.pagination1.Product;
import com.te.pagination1.service.ProductService;

@RestController
@RequestMapping("/product")
public class Controller {
	
	@Autowired
	private ProductService service; 
	
	
	@GetMapping
	public List<Product> findAll() {
		List<Product> findAllData = service.findAllData();
		return findAllData;
		
	}
	@GetMapping("/{field}")
	public List<Product> finDataByfield(@PathVariable String field) {
		List<Product> findDatabyField = service.findDatabyField(field);
		return findDatabyField;
		
	}
	
	@GetMapping("/{offset}/{pagesize}")
	public Page<Product> finDataByfield(@PathVariable int offset,@PathVariable int pagesize) {
		Page<Product> findDataPage = service.findDatapagination(offset, pagesize);
		return findDataPage;
		
	}
	@GetMapping("/{offset}/{pagesize}/{field}")
	public Page<Product> findDataPaginationWithField(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field) {
		Page<Product> findDatapaginationWithField = service.findDatapaginationWithField(offset, pagesize, field);
		return findDatapaginationWithField;
	}

}
