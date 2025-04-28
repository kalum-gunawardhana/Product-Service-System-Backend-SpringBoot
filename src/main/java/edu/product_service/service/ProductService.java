package edu.product_service.service;

import edu.product_service.dto.ProductDto;
import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();
}
