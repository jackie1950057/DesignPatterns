package tj.sse.patterns.utils;

/**
 * @author DOGGY_LEE
 * @date 2021/9/27 15:41
 * @description 控制台输出工具类
 */
public class Printer 
{
    /**
     * @class Printer
     * @method Printer
     * @description 禁止实例化
     * @param []
     * @return
     * */
    private Printer(){}

    /**
     * @class Printer
     * @method print
     * @description 任意输出，无换行
     * @param [objs]
     * @return void
     * */
    public static void print(Object...objs)
    {
        for(Object obj :objs)
            System.out.print(obj);
    }

    /**
     * @class Printer
     * @method println
     * @description 任意输出，有换行
     * @param [objs]
     * @return void
     * */
    public static void println(Object...objs)
    {
        print(objs);
        System.out.println("");
    }
}
