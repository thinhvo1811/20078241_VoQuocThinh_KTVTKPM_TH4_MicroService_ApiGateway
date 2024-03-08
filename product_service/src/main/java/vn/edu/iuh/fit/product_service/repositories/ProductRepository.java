package vn.edu.iuh.fit.product_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.product_service.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
