package VentasOnline.Venta.Repository;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product",schema = "shoping_line")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_product")
    private Integer idProduct;
    @Column(name = "name_product")
    private String nameProduct;
    @Column(name = "description_product")
    private String descriptionProduct;
    @Column(name = "amount")
    private Double amount;

}
