/*
 * Copyright 2011-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package pl.com.bottega.ecommerce.sales.domain.offer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Data
@AllArgsConstructor
public class OfferItem {

    // product
    private ProductSnapshot product;

    private int quantity;

    private Money totalCost;

    private Discount discount;

    /**
     *
     * @param item
     * @param delta
     *            acceptable percentage difference
     * @return
     */
    public boolean sameAs(OfferItem other, double delta) {
        if (!Objects.equals(product, other.product)
            || !Objects.equals(quantity, other.quantity)
            || !Objects.equals(totalCost, other.totalCost)
            || !Objects.equals(delta, other.discount)) {
            return false;
        }


       return isPriceSimillar(other, delta);
    }

    private boolean isPriceSimillar(OfferItem other, double deltas) {
        Money max;
        Money min;
        if (totalCost.compareTo(other.totalCost) > 0) {
            max = totalCost;
            min = other.totalCost;
        } else {
            max = other.totalCost.getAmount();
            min = totalCost.getAmount();
        }

        BigDecimal difference = max.subtract(min);
        BigDecimal acceptableDelta = max.multiply(BigDecimal.valueOf(delta / 100));

        return acceptableDelta.compareTo(difference) > 0;
    }

}
