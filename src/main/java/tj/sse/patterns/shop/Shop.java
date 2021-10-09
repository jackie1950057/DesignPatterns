package tj.sse.patterns.shop;

/**
 * @author DOGGY_LEE
 * @date 2021/10/8 21:03
 * @description Shop
 */
public class Shop {
    /**
     * @description 静态实例
     * */
    private final static Shop instance = new Shop();
    /**
     * @description  饮料贩卖机
     * */
    private Seller seller;

    /**
     * @class Shop
     * @method Shop
     * @description 构造函数私有化
     * @param []
     * @return
     * */
    private Shop()
    {
        seller=new Seller();
    }

    /**
     * @class Shop
     * @method getInstance
     * @description 获取实例
     * @param []
     * @return tj.sse.patterns.shop.Shop
     * */
    public static Shop getInstance(){return instance;}


    public Food sellFood(String name){
        return seller.getFood(name);
    }


    public MilkTea sellMilkTea(String name){
        return seller.getMilkTea(name);
    }
}
