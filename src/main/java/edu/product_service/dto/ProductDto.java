package edu.product_service.dto;

import edu.product_service.enums.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long id;
    private String title;
    private double price;
    private String description;
    private ProductCategory category;
    private String image;
}
