package tj.sse.patterns.factorymethod;

import tj.sse.patterns.utils.Printer;

/**
 * @author DOGGY_LEE
 * @date 2021/9/26 21:31
 * @description 圆形
 */
public class Circle implements Shape
{
    /**
     * @class Circle
     * @method draw
     * @description 画圆
     * @param []
     * @return void
     * */
    @Override
    public void draw()
    {
        Printer.println("Draw a circle");
    }
}
