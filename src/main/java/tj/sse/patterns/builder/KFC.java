package tj.sse.patterns.builder;

/**
 * @author DOGGY_LEE
 * @date 2021/9/27 14:53
 * @description KFC餐厅，director
 */
public class KFC
{
    public static Buger makeBuger(BugerMaker maker)
    {
        return maker.makeBuger();
    }
}
