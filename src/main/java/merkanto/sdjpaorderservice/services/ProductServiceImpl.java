package merkanto.sdjpaorderservice.services;

import jakarta.transaction.Transactional;
import merkanto.sdjpaorderservice.domain.Product;
import merkanto.sdjpaorderservice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.saveAndFlush(product);
    }

    @Transactional
    @Override
    public Product updateQOH(Long id, Integer quantityOnHand) {
        Product product = productRepository.findById(id)
                .orElseThrow();

        product.setQuantityOnHand(quantityOnHand);

        return productRepository.saveAndFlush(product);
    }
}
