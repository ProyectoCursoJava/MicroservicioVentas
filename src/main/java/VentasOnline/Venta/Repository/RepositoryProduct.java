package VentasOnline.Venta.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryProduct extends JpaRepository<Product, Integer> {
    //public List<Product> findAll();

    @Query("SELECT p FROM Product p WHERE p.nameProduct = :name")
    List<Product> consultaPorNombre(@Param("name") String name);
}
