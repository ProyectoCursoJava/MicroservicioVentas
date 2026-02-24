package VentasOnline.Venta.Controller;

import VentasOnline.Venta.Repository.Product;
import VentasOnline.Venta.Repository.RepositoryProduct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/products")
public class ProductController {

    private final RepositoryProduct repositoryProduct;

    public ProductController(RepositoryProduct repositoryProduct) {
        this.repositoryProduct = repositoryProduct;
    }

    @GetMapping
    public List<Product> listarProductos(@RequestParam(value = "name") String nombre) {
        return repositoryProduct.consultaPorNombre(nombre);
    }
}