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
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

/**
 * {@code Product} represents properties and behaviors of
 * product objects in the Product Management System.
 * <br>
 * * Each product has an id, name, and price
 * * <br>
 * * Each product can have a discount, calculated based on a
 * * {@link DISCOUNT_RATE discount rate}
 * * @version 4.0
 * * @author oracle
 */
public sealed class Product permits Drink, Food {
    private int id;
    private String name;
    private BigDecimal price;
    private final Rating rating;
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.9);

    /**
     * A constant that defines a
     * {@link java.math.BigDecimal BigDecimal} value of the discount
     * rate
     * <br>
     * Discount rate is 10%
     */
    Product() {
        this(0, "no name", BigDecimal.ZERO);
    }

    Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    }

    Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

//    public void setId(final int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;

    }

//    public void setPrice(final BigDecimal price) {
//        this.price = price;
//    }

//    public void setPrice(final double price) {
//        this.price = BigDecimal.valueOf(price);
//    }

    public Rating getRating() {
        return rating;
    }

    /**
     * Calculates discount based on a product price and
     * * {@link DISCOUNT_RATE discount rate}
     * * @return a {@link java.math.BigDecimal BigDecimal}
     *
     * @return the current date
     */
    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    public Product applyRating(Rating newRating) {
        return new Product(getId(), getName(), getPrice(),
                newRating);
    }

    ;

    /**
     * Assumes that the best before date is today
     *
     * @return the current date
     */
    public LocalDate getBestBefore() {
        return LocalDate.now();
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + price + ", "
                + getDiscount() + ", " + rating.getStars() + ", " + getBestBefore();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (o instanceof Product product) {

            return id == product.id && Objects.equals(name, product.name);
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
