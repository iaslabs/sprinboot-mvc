package co.com.idi.springbootbasics.services;

import co.com.idi.springbootbasics.entities.ProductDbo;
import co.com.idi.springbootbasics.models.Product;
import co.com.idi.springbootbasics.models.ProductDto;
import co.com.idi.springbootbasics.repositories.IProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private final IProductRepository productRepository;

    public ProductDto saveProduct (ProductDto productDto){
        //Convertir Dto a objeto de dominio
        Product product = ProductDto.toDomain(productDto);
        // validaciones al product

        //Guardar product en BD
        return ProductDto.fromDomain(ProductDbo.toDomain(productRepository.save(ProductDbo.fromDomain(product))));
    }
}
