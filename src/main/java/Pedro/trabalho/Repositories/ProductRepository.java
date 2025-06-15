package Pedro.trabalho.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Pedro.trabalho.Product.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}
