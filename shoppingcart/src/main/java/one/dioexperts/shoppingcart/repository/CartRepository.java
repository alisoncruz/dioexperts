package one.dioexperts.shoppingcart.repository;

import one.dioexperts.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart,Integer> {
}
