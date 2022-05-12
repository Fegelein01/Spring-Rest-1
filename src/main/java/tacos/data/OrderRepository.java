package tacos.data;

import tacos.Order;

import org.springframework.data.repository.CrudRepository;
import tacos.Ingredient;

public interface OrderRepository extends CrudRepository<Order, String> {
}