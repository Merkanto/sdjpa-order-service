package merkanto.sdjpaorderservice.services;

import merkanto.sdjpaorderservice.domain.Product;

public interface ProductService {

    Product saveProduct(Product product);

    Product updateQOH(Long id, Integer quantityOnHand);
}
