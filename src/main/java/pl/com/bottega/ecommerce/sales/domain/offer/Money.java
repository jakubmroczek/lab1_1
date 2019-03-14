package pl.com.bottega.ecommerce.sales.domain.offer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Money {

    public enum Currency {
        PLN,
        DOLLARS,
        JURO
    }

    private Currency currency;
    private BigDecimal amount;

    private BigDecimal getAsPLN() {
        //TODO: Add conversion
        return new BigDecimal(0);
    }
}
