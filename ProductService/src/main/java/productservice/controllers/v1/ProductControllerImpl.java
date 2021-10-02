package productservice.controllers.v1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import productservice.GreetingController;
import productservice.dtos.ProductDto;
import productservice.services.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("http://localhost:3000")
public class ProductControllerImpl implements GreetingController {

    private final ProductService productService;

    @Override
    @GetMapping("/products")
    public List<ProductDto> products() {
        return productService.findAll();
    }

}






