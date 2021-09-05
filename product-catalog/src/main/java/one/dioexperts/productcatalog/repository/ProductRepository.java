package one.dioexperts.productcatalog.repository;

import one.dioexperts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {


}
