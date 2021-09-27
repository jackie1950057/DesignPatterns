package tj.sse.singleton;

import org.junit.Test;
import tj.sse.patterns.singleton.Singleton;
import tj.sse.patterns.utils.Printer;

import static org.junit.Assert.assertTrue;

/**
 * @author DOGGY_LEE
 * @date 2021/9/26 21:02
 * @description 单例测试
 */
public class SingletonTest
{
    @Test
    public void singletonTest()
    {
        Printer.println("---------------- [Pattern] Singleton ----------------");
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Printer.println("s1:",s1);
        Printer.println("s2:",s2);
        Printer.println(s1==s2);
        assertTrue("Singleton Fail",s1==s2);
        Printer.println("------------------------ END ------------------------");
    }
}
