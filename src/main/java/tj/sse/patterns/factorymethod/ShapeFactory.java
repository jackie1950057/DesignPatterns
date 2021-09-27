package tj.sse.patterns.factorymethod;

/**
 * @author DOGGY_LEE
 * @date 2021/9/27 8:58
 * @description 形状工厂
 */
public class ShapeFactory
{
    /**
     * @class ShapeFactory
     * @method getShape
     * @description 获得形状
     * @param [str]
     * @return tj.sse.patterns.factorymethord.Shape
     * */
    public static Shape getShape(String str)
    {
        switch (str)
        {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
