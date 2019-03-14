package pl.com.bottega.ecommerce.sales.domain.offer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ProductSnapshot {
    private long id;
    private String name;
    private String type;
    private Date snapshot;
    private Money price;
}
