package co.com.idi.springbootbasics.models;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class Product {
    private Integer id;
    private String code;
    private String name;
    private Integer price;
    private Integer stock;
    private Boolean status;
    private Timestamp createdDate;
}
