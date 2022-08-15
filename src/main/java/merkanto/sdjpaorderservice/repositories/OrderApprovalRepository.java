package merkanto.sdjpaorderservice.repositories;

import merkanto.sdjpaorderservice.domain.OrderApproval;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderApprovalRepository extends JpaRepository<OrderApproval, Long> {
}
