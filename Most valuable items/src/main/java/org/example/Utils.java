package org.example;

import java.util.Comparator;
import java.util.List;

public class Utils {

    public static List<StockItem> sort(List<StockItem> stockItems) {
        stockItems.sort(Comparator.comparingDouble(stockItem ->
                (stockItem.getQuantity() * stockItem.getPricePerUnit()) * -1));
 // Other solutions
//        stockItems.sort(Comparator.comparing(item -> item.getPricePerUnit() * item.getQuantity(),
//                Comparator.reverseOrder()));
//        stockItems.sort(Collections.reverseOrder(
//                Comparator.comparingDouble(x -> x.getPricePerUnit() * x.getQuantity())));
        return stockItems;
    }
}
