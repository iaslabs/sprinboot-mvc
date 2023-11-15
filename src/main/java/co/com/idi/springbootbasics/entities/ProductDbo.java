package co.com.idi.springbootbasics.entities;

import java.sql.Timestamp;

import co.com.idi.springbootbasics.models.Product;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "product")
@Builder
@Getter
public class ProductDbo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String code;

    private String name;

    private Integer price;

    private Integer stock;

    private Boolean status;

    @CreationTimestamp
    private Timestamp createdDate;


    public static ProductDbo fromDomain(Product product){
        return new ProductDbo(product.getId(),product.getCode(),product.getName(), product.getPrice(),
                           product.getStock(), product.getStatus(), product.getCreatedDate());
    }

    public static Product toDomain(ProductDbo productDbo){
        return new Product(productDbo.getId(),productDbo.getCode(),productDbo.getName(), productDbo.getPrice(),
                              productDbo.getStock(), productDbo.getStatus(), productDbo.getCreatedDate());
    }

}
