package com.webler.inventory.model.entities.constants;

public class NativeQueries {

    public static final String FIND_LOWEST_PRICE_IN_CATEGORY =
            "SELECT " +
            "  p.id, " +
            "  t.category_name name, " +
            "  p.price value " +
            "FROM product p " +
            "JOIN " +
            "( " +
            "  SELECT c.id category_id, c.name category_name, MIN(price) price " +
            "  FROM product pr " +
            "  INNER JOIN category c ON pr.category_id = c.id " +
            "  GROUP BY pr.category_id " +
            ") t " +
            "ON p.category_id = t.category_id " +
            "AND p.price = t.price";

    public static final String FIND_BIGGEST_PRICE_DROPS =
            "SELECT p.id, p.name, min_max_date_prices.min_date_price value " +
                    "FROM ( " +
                    "  SELECT max_date_prices.product_id product_id, min_date_prices.price min_date_price, max_date_prices.price max_date_price " +
                    "  FROM ( " +
                    "    SELECT p.product_id, p.price " +
                    "    FROM product_history p " +
                    "    INNER JOIN " +
                    "    ( " +
                    "      SELECT product_id, MAX(ph.date) DATE " +
                    "      FROM product_history ph " +
                    "      GROUP BY product_id " +
                    "    ) as max_dates " +
                    "    ON p.product_id = max_dates.product_id AND p.date = max_dates.date " +
                    "  ) as max_date_prices " +
                    "  INNER JOIN  " +
                    "  ( " +
                    "    SELECT p.product_id, p.price " +
                    "    FROM product_history p " +
                    "    INNER JOIN " +
                    "    ( " +
                    "      SELECT product_id, MIN(ph.date) DATE " +
                    "      FROM product_history ph " +
                    "      GROUP BY product_id " +
                    "    ) AS min_dates " +
                    "    ON p.product_id = min_dates.product_id AND p.date = min_dates.date " +
                    "  ) as min_date_prices " +
                    "  ON max_date_prices.product_id = min_date_prices.product_id " +
                    ") min_max_date_prices " +
                    "INNER JOIN product p ON p.id = min_max_date_prices.product_id";

}
