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
 *
 */
package labs.pm.app;

import labs.pm.data.*;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * {@code Shop} class represents an application that manages
 * Products
 *
 * @author oracle
 * @version 4.0
 */
public class Shop {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99),
                Rating.THREE_STAR);
        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(28), Rating.FOUR_STAR);
        Product p3 = pm.createProduct(103, "cake", BigDecimal.valueOf(40), Rating.FIVE_STAR, LocalDate.now().plusDays(1));
        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99),
                Rating.TWO_STAR, LocalDate.now());
        Product p5 = p1.applyRating(Rating.FIVE_STAR);
        Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99),
                Rating.FIVE_STAR);
        Product p7 = pm.createProduct(106, "Chocolate", BigDecimal.valueOf(2.99),
                Rating.FIVE_STAR, LocalDate.now().plusDays(1));
        Product p8 = p4.applyRating(Rating.FIVE_STAR);
        Product p9 = p1.applyRating(Rating.NOT_RATED);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println(p8);
        System.out.println(p9);
        if (p3 instanceof Food) {
            System.out.println(((Food) p3).getBestBefore());
        }
        System.out.println(p3.getBestBefore());
        System.out.println(p1.getBestBefore());
    }
}