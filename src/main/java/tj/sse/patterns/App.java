package tj.sse.patterns;

import tj.sse.patterns.builder.Buger;
import tj.sse.patterns.builder.ChickenBugerMaker;
import tj.sse.patterns.builder.KFC;
import tj.sse.patterns.builder.ShrimpBugerMaker;
import tj.sse.patterns.factorymethod.Shape;
import tj.sse.patterns.factorymethod.ShapeFactory;
import tj.sse.patterns.singleton.Singleton;
import tj.sse.patterns.utils.Printer;

/**
 * @author DOGGY_LEE
 * @date 2021/9/27 9:23
 * @description mainApp
 */
public class App
{
    public static void main(String[] args)
    {
        Printer.println("---------------- [Pattern] Singleton ----------------");
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Printer.println("s1:",s1);
        Printer.println("s2:",s2);
        Printer.println(s1==s2);
        Printer.println("------------------------ END ------------------------");

        Printer.println("---------------- [Pattern] ShapeFactory ----------------");
        Shape s11,s12,s13;
        s11= ShapeFactory.getShape("CIRCLE");
        s12= ShapeFactory.getShape("SQUARE");
        s13= ShapeFactory.getShape("RECTANGLE");
        s11.draw();
        s12.draw();
        s13.draw();
        Printer.println("------------------------ END ------------------------");

        Printer.println("---------------- [Pattern] Builder ----------------");
        ChickenBugerMaker cbm=new ChickenBugerMaker();
        ShrimpBugerMaker sbm=new ShrimpBugerMaker();
        Buger buger1= KFC.makeBuger(cbm);
        Buger buger2=KFC.makeBuger(sbm);
        Printer.println("ChickenBuger:");
        buger1.show();
        Printer.println("ShrimpBuger:");
        buger2.show();
        Printer.println("------------------------ END ------------------------");
    }
}
