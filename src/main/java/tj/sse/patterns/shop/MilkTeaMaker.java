package tj.sse.patterns.shop;

import tj.sse.patterns.builder.Buger;

/**
 * @author DOGGY_LEE
 * @date 2021/10/8 21:32
 * @description 奶茶机
 */
public interface MilkTeaMaker {
    /**
     * @class MilkTeaMaker
     * @method addSuger
     * @description 加糖
     * @param []
     * @return void
     * */
    void addSuger();

    /**
     * @class MilkTeaMaker
     * @method addIce
     * @description 加冰
     * @param []
     * @return void
     * */
    void addIce();

    /**
     * @class MilkTeaMaker
     * @method addItem
     * @description 加小料
     * @param []
     * @return void
     * */
    void addItem();

    /**
     * @class MilkTeaMaker
     * @method getName
     * @description 奶茶名称
     * @param []
     * @return java.lang.String
     * */
    String getName();

    /**
     * @class MilkTeaMaker
     * @method makeMilkTea
     * @description 做奶茶
     * @param []
     * @return tj.sse.patterns.shop.MilkTea
     * */
    MilkTea makeMilkTea();
}
