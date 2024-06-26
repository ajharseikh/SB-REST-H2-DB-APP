package in.hero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hero.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{
	//You can use CrudRepository<> interface instead of JpaRepository

}
