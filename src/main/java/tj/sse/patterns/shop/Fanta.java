package tj.sse.patterns.shop;

import tj.sse.patterns.utils.Printer;

/**
 * @author DOGGY_LEE
 * @date 2021/10/8 23:17
 * @description 芬达
 */
public class Fanta implements Food{
    @Override
    public void eaten() {Printer.println("有一瓶芬达被喝掉啦");}
}
