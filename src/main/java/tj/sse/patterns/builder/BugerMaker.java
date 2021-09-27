package tj.sse.patterns.builder;

/**
 * @author DOGGY_LEE
 * @date 2021/9/27 15:25
 * @description 汉堡机
 */
public interface BugerMaker
{
    void makeMeat();
    void makeVeg();
    void makeSauce();
    Buger makeBuger();
}
