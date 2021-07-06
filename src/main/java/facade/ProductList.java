package facade;

import java.util.Map;

public class ProductList {

    private Map<String, Integer> productList;

    public ProductList(){ }

    public ProductList(Map<String, Integer> productList){
        this.productList = productList;
    }

    public Map<String, Integer> getProductList(){ return productList;}
    public void setProductList(Map<String, Integer> productList){ this.productList = productList;}

    public void addProduct(String product, Integer quantity){
        productList.put(product, quantity);
    }

}
