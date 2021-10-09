package tj.sse.patterns.shop;

/**
 * @author DOGGY_LEE
 * @date 2021/10/8 23:19
 * @description 芬达货架
 */
public class FantaShelf implements Shelf{
    @Override
    public String getName() {
        return "芬达";
    }

    @Override
    public Food getFood() {
        return new Fanta();
    }
}
