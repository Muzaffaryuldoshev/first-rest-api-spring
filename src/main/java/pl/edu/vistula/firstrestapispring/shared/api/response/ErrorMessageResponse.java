package pl.edu.vistula.firstrestapispring.shared.api.response;

import pl.edu.vistula.firstrestapispring.product.api.request.UpdateProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.response.ProductResponse;
import pl.edu.vistula.firstrestapispring.product.domain.Product;
import pl.edu.vistula.firstrestapispring.product.repository.ProductRepository;
import pl.edu.vistula.firstrestapispring.product.support.ProductExceptionSupplier;

public class ErrorMessageResponse {

    private ProductRepository productRepository;

    private final String message;

    public ErrorMessageResponse(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

}
