package creational.simpleFactory;

import java.util.HashMap;
import java.util.Map;

public class SimpleFactory {

    static Map<ProductType, Product> productMap = new HashMap<>();

    static {
        productMap.put(ProductType.鍵盤, new Keyboard());
        productMap.put(ProductType.滑鼠, new Mouse());
    }

    public static Product getProduct(ProductType productType) {
        return productMap.get(productType);
    }
}
