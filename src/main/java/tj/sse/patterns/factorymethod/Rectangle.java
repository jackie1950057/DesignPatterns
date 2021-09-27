package tj.sse.patterns.factorymethod;

import tj.sse.patterns.utils.Printer;

/**
 * @author DOGGY_LEE
 * @date 2021/9/26 20:58
 * @description 矩形
 */
public class Rectangle implements Shape
{
    /**
     * @class Rectangle
     * @method draw
     * @description 重写draw
     * @param []
     * @return void
     * */
    @Override
    public void draw()
    {
        Printer.println("Draw a rectangle");
    }
}
