package productservice.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import productservice.dtos.ProductDto;
import productservice.model.Product;
import productservice.repositories.ProductRepository;

import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<ProductDto> findAll() {
        List<ProductDto> listProductDto = new LinkedList<>();
        for (Product p: productRepository.findAll()) {
            listProductDto.add(new ProductDto(p));
        }
        return listProductDto;
    }
}
