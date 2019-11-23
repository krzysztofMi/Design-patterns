package facade;

import Eats.Cake;

import java.util.Map;

public class CakeMaker {
    ProductList productList;
    Shop shop;
    SpongeCake cake;
    Oven oven;
    CakeChecker cakeChecker;


    public CakeMaker(Shop shop){
        this.shop = shop;
        productList = new ProductList();
        oven = new Oven();
        cakeChecker = new CakeChecker();
        cake = new SpongeCake();
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public void setCake(SpongeCake cake) {
        this.cake = cake;
    }

    public void setCakeChecker(CakeChecker cakeChecker) {
        this.cakeChecker = cakeChecker;
    }

    public void setOven(Oven oven) {
        this.oven = oven;
    }

    public void makeCake(Map<String, Integer> ingredientsList){
        productList.setProductList(ingredientsList);
        Map<String,Integer> ingredients = shop.buy(ingredientsList);
        cake = new SpongeCake(ingredients);
        oven.setCake((SpongeCake)cake.prepareCake());
        Cake cake = oven.bakeCake(5);
        cakeChecker.checkCakeStatus(cake);
    }

    public void buyIngredients(){
        productList.setProductList(shop.buy(productList.getProductList()));
    }
}
