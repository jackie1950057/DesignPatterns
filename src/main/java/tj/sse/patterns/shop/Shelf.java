package tj.sse.patterns.shop;

/**
 * @author DOGGY_LEE
 * @date 2021/10/8 21:08
 * @description 货架接口
 */
public interface Shelf {
    /**
     * @class Shelf
     * @method getName
     * @description 商品名称
     * @param []
     * @return java.lang.String
     * */
    String getName();

    /**
     * @class Shelf
     * @method sellFood
     * @description 获得食物
     * @param []
     * @return tj.sse.patterns.shop.Food
     * */
    Food getFood();
}
