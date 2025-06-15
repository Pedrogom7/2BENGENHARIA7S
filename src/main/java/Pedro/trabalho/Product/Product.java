package Pedro.trabalho.Product;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name = "product")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Setter
    private String name;

    @Setter
    private Integer price;

    public Product(ProductRequestDTO data) {
        this.name = data.name();
        this.price = data.price();
    }
}