package fatec.sp.gov.br.productbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.sp.gov.br.productbackend.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
