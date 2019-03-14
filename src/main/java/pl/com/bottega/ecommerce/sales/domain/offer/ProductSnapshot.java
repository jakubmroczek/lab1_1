package pl.com.bottega.ecommerce.sales.domain.offer;

import lombok.Data;

import java.util.Date;

@Data
public class ProductSnapshot {
    private long id;
    private String name;
    private String type;
    private Date snapshot;
    private Money price;
}
