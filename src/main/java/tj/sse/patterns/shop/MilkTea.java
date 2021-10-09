package tj.sse.patterns.shop;

import tj.sse.patterns.utils.Printer;

/**
 * @author DOGGY_LEE
 * @date 2021/10/8 21:32
 * @description 奶茶
 */
public class MilkTea {
    /**
     * @description 糖度
     * */
    public String suger;
    /**
     * @description 冰度
     * */
    public String ice;
    /**
     * @description 小料
     * */
    public String item;

    /**
     * @class MilkTea
     * @method eaten
     * @description 喝掉
     * @param []
     * @return void
     * */
    public void eaten(){
        Printer.println("有一杯",suger,ice,"料为",item,"的奶茶被喝掉啦");
    }
}
