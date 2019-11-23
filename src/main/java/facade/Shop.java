package facade;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Shop {
    private Map<String, Integer> products;

    public Shop(){
        products = new HashMap<String, Integer>(){
            {
                put("egg", 10);
                put("sugar", 10);
                put("flour", 5);
            }};
    }

    public Map<String, Integer> buy(Map<String, Integer> products){
        Set<String> productsInShop = this.products.keySet();
        Set<String> productsToBuy = products.keySet();
        Map<String, Integer> boughtProducts = new HashMap<>();
        for(String product: productsToBuy){
            Integer productInShopNumber = this.products.getOrDefault(product, 0);
            Integer numberOfProductsToBuy = this.products.get(product);
            if(productInShopNumber<numberOfProductsToBuy){
                boughtProducts.put(product, productInShopNumber);
                this.products.put(product, 0);
            }else {
                boughtProducts.put(product, numberOfProductsToBuy);
                this.products.put(product, productInShopNumber - numberOfProductsToBuy);
            }
        }
        return boughtProducts;
    }
}
