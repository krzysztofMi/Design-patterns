package facade;

import Eats.Cake;

import java.util.Map;

public class CakeMaker {
    ProductList productList;
    Shop shop;
    SpongeCake cake;
    Oven oven;
    CakeChecker cakeChecker;


    public CakeMaker(){
        shop = new Shop();
        productList = new ProductList();
        oven = new Oven();
        cakeChecker = new CakeChecker();
        cake = new SpongeCake();
    }

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

    public void makeCake(Map<String, Integer> ingredientsList, Integer bakeTime){
        productList.setProductList(ingredientsList);
        Map<String,Integer> ingredients = shop.buy(ingredientsList);
        cake = new SpongeCake(ingredients);
        setBakeTime(bakeTime);
        System.out.println(oven.getBakeTime());
        oven.setCake((SpongeCake)cake.prepareCake());
        cake =(SpongeCake) oven.bakeCake();
        cakeChecker.checkCakeStatus(cake);
    }

    public void setBakeTime(Integer time){oven.setBakeTime(time);}
    public Integer getCakeStatus(){ return cake.getCakeStatus();}
    public void buyIngredients(){
        productList.setProductList(shop.buy(productList.getProductList()));
    }
}
