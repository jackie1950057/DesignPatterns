package tj.sse.factorymethod;

import org.junit.Test;
import tj.sse.patterns.factorymethod.Shape;
import tj.sse.patterns.factorymethod.ShapeFactory;
import tj.sse.patterns.utils.Printer;

import static org.junit.Assert.assertTrue;

/**
 * @author DOGGY_LEE
 * @date 2021/9/27 9:11
 * @description 简单工厂测试
 */
public class ShapeFactoryTest {
    @Test
    public void shapeFactoryTest()
    {
        Printer.println("---------------- [Pattern] ShapeFactory ----------------");
        Shape s1,s2,s3;
        s1= ShapeFactory.getShape("CIRCLE");
        s2= ShapeFactory.getShape("SQUARE");
        s3= ShapeFactory.getShape("RECTANGLE");
        s1.draw();
        s2.draw();
        s3.draw();
        assertTrue("ShapeFactory Fail",s1!=null&&s2!=null&&s3!=null);
        Printer.println("------------------------ END ------------------------");
    }
}
