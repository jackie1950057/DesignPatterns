package tj.sse.patterns.builder;

import tj.sse.patterns.utils.Printer;

/**
 * @author DOGGY_LEE
 * @date 2021/9/27 14:55
 * @description 汉堡, product
 */
public class Buger {
    //肉
    private String meat;
    //蔬菜
    private String veg;
    //酱
    private String sauce;

    /**
     * @class Buger
     * @method setMeat
     * @description 设肉
     * @param [str]
     * @return void
     * */
    public void setMeat(String str){this.meat=str;}

    /**
     * @class Buger
     * @method setVeg
     * @description 设蔬菜
     * @param [str]
     * @return void
     * */
    public void setVeg(String str){this.veg=str;}

    /**
     * @class Buger
     * @method setSauce
     * @description 设酱
     * @param [str]
     * @return void
     * */
    public void setSauce(String str){this.sauce=str;}

    /**
     * @class Buger
     * @method show
     * @description 展示
     * @param []
     * @return void
     * */
    public void show()
    {
        Printer.println("meat:",meat);
        Printer.println("veg:",veg);
        Printer.println("sauce:",sauce);
    }
}
