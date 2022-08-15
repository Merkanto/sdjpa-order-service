package merkanto.sdjpaorderservice.repositories;

import merkanto.sdjpaorderservice.domain.Customer;
import merkanto.sdjpaorderservice.domain.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Long> {

    List<OrderHeader> findAllByCustomer(Customer customer);
}
