package merkanto.sdjpaorderservice.bootstrap;

import jakarta.transaction.Transactional;
import merkanto.sdjpaorderservice.domain.OrderHeader;
import merkanto.sdjpaorderservice.repositories.OrderHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    OrderHeaderRepository orderHeaderRepository;

    @Autowired
    BootstrapOrderService bootstrapOrderService;

//    @Transactional
//    public void readOrderData() {
//        OrderHeader orderHeader = orderHeaderRepository.findById(1L).get();
//
//        orderHeader.getOrderLines().forEach(ol -> {
//            System.out.println(ol.getProduct().getDescription());
//
//            ol.getProduct().getCategories().forEach(cat -> {
//                System.out.println(cat.getDescription());
//            });
//        });
//    }

    @Override
    public void run(String... args) throws Exception {
        bootstrapOrderService.readOrderData();
    }
}
