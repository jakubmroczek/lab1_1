package pl.com.bottega.ecommerce.sales.domain.offer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
/**
 * Class needed by future features.s
 */
public class Discount {
    private Money amount;
    private String cause;
}
