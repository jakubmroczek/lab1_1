package pl.com.bottega.ecommerce.sales.domain.offer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Money {

    public enum Currency {
        PLN,
        DOLLARS,
        JURO
    }

    private Currency currency;
    private long amount;
}
