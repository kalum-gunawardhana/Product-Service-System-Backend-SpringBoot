package edu.product_service.service.impl;

import edu.product_service.dto.ProductDto;
import edu.product_service.entity.ProductEntity;
import edu.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    RestTemplate restTemplate;

    public List<ProductDto> getAllProducts(){
        ProductDto[] forObject = restTemplate.getForObject("https://fakestoreapi.com/products", ProductDto[].class);
        return Arrays.stream(forObject).toList();
    }
}
