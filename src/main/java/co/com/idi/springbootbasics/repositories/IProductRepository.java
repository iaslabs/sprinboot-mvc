package co.com.idi.springbootbasics.repositories;

import co.com.idi.springbootbasics.entities.ProductDbo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<ProductDbo, Integer> {

}
