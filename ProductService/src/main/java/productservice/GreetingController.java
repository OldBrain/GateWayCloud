package productservice;

import org.springframework.web.bind.annotation.GetMapping;
import productservice.dtos.ProductDto;

import java.util.List;

public interface GreetingController {
    @GetMapping("/products")
    List<ProductDto> products();

}
