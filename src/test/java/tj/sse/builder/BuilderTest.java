package tj.sse.builder;

import org.junit.Test;
import tj.sse.patterns.builder.Buger;
import tj.sse.patterns.builder.ChickenBugerMaker;
import tj.sse.patterns.builder.KFC;
import tj.sse.patterns.builder.ShrimpBugerMaker;
import tj.sse.patterns.utils.Printer;

import static org.junit.Assert.assertTrue;

/**
 * @author DOGGY_LEE
 * @date 2021/9/27 16:26
 * @description 建造者模式
 */
public class BuilderTest {
    @Test
    public void BuilderTest() {
        Printer.println("---------------- [Pattern] Builder ----------------");
        ChickenBugerMaker cbm=new ChickenBugerMaker();
        ShrimpBugerMaker sbm=new ShrimpBugerMaker();
        Buger buger1=KFC.makeBuger(cbm);
        Buger buger2=KFC.makeBuger(sbm);
        Printer.println("ChickenBuger:");
        buger1.show();
        Printer.println("ShrimpBuger:");
        buger2.show();
        assertTrue("Builder Fail",buger1!=null&&buger2!=null);
        Printer.println("------------------------ END ------------------------");
    }
}
