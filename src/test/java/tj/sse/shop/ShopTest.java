package tj.sse.shop;

import org.junit.Test;
import tj.sse.patterns.shop.Food;
import tj.sse.patterns.shop.MilkTea;
import tj.sse.patterns.shop.Shop;
import tj.sse.patterns.utils.Printer;

/**
 * @author DOGGY_LEE
 * @date 2021/10/8 21:21
 * @description 超市测试
 */
public class ShopTest {
    @Test
    public void ShopTest()
    {
        Printer.println("---------------- [Pattern] Shop ----------------");
        Shop shop= Shop.getInstance();
        Food food=shop.sellFood("芬达");
        food.eaten();
        food=shop.sellFood("可乐");
        food.eaten();
        MilkTea milkTea= shop.sellMilkTea("珍珠奶茶");
        milkTea.eaten();
        milkTea= shop.sellMilkTea("椰果奶茶");
        milkTea.eaten();
        Printer.println("---------------------- END ------------------------");
    }
}
