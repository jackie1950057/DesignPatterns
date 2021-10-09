package tj.sse.patterns.shop;

import tj.sse.patterns.utils.Printer;

/**
 * @author DOGGY_LEE
 * @date 2021/10/8 21:17
 * @description 可乐
 */
public class Coke implements Food{
    @Override
    public void eaten() {
        Printer.println("有一瓶可乐被喝掉啦");
    }
}
