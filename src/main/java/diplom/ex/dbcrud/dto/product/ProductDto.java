package diplom.ex.dbcrud.dto.product;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@Getter
@Setter
public class ProductDto {
    private Long id;
    private String name;
    private int number;
    private BigDecimal price;
}