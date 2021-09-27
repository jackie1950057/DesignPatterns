package tj.sse.patterns.factorymethod;

import tj.sse.patterns.utils.Printer;

/**
 * @author DOGGY_LEE
 * @date 2021/9/26 21:30
 * @description 正方形
 */
public class Square implements Shape
{
    /**
     * @class Square
     * @method draw
     * @description 重写draw
     * @param []
     * @return void
     * */
    @Override
    public void draw()
    {
        Printer.println("Draw a Square");
    }
}
