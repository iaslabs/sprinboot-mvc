package co.com.idi.springbootbasics.models;

import java.sql.Timestamp;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductDto {

    private Integer id;
    private String code;
    private String name;
    private Integer price;
    private Integer stock;
    private Boolean status;
    private Timestamp createdDate;

    public static Product toDomain(ProductDto productDto){
        return new Product(productDto.getId(),productDto.getCode(),productDto.getName(), productDto.getPrice(),
                           productDto.getStock(), productDto.getStatus(), productDto.getCreatedDate());

    }

    public static ProductDto fromDomain (Product product){
        return new ProductDto(product.getId(),product.getCode(),product.getName(), product.getPrice(),
                           product.getStock(), product.getStatus(), product.getCreatedDate());
    }
}
