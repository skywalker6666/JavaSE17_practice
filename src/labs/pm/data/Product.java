/*
 * Copyright (c) 2024.
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 */

package labs.pm.data;

import java.math.BigDecimal;

/**
 * @author alan9
 **/
public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    public static final BigDecimal DISCOUNT_RATE=BigDecimal.valueOf(0.1);
    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }
    public void setPrice(final double price) {
        this.price = BigDecimal.valueOf(price);
    }
}
