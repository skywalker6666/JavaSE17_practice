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

package labs.pm.optional;
import labs.pm.data.Rating;
import java.math.BigDecimal;

/**
 * @author alan9
 **/
public class SealedExample {
    public static void main(String[] args) {
        Product p1 = new CollectableItem(130, "Big Ben design coffeemug", BigDecimal.valueOf(10.45), Rating.FOUR_STAR, " Big");

// Print the product name of the collectable item and its discount.
        System.out.println(
                p1.name() + " has a discount of " + p1.discount() + "%");
// Create a Drink product with its details.
        Product p2 = new Drink(
                120, "Kefir", BigDecimal.valueOf(3.55), Rating.FIVE_STAR);
// Print the product name of the drink item and its discount.
        System.out.println(
                p2.name() + " has a discount of " + p2.discount() + "%");
    }
}
