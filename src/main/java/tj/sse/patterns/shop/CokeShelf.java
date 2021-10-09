package tj.sse.patterns.shop;

/**
 * @author DOGGY_LEE
 * @date 2021/10/8 21:19
 * @description 可乐货架
 */
public class CokeShelf implements Shelf{
    @Override
    public String getName() {
        return "可乐";
    }

    @Override
    public Food getFood() {
        return new Coke();
    }
}
