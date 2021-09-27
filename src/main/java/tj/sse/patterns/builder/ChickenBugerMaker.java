package tj.sse.patterns.builder;

/**
 * @author DOGGY_LEE
 * @date 2021/9/27 16:01
 * @description 鸡腿堡
 */
public class ChickenBugerMaker implements BugerMaker
{
    //汉堡
    private Buger burger;
    /**
     * @class ChickenBugerMaker
     * @method makeMeat
     * @description 做肉
     * @param []
     * @return void
     * */
    @Override
    public void makeMeat()
    {
        this.burger.setMeat("Chicken");
    }

    /**
     * @class ChickenBugerMaker
     * @method makeVeg
     * @description 做菜
     * @param []
     * @return void
     * */
    @Override
    public void makeVeg() {
        this.burger.setVeg("Lettuce");
    }

    /**
     * @class ChickenBugerMaker
     * @method makeSauce
     * @description 加酱
     * @param []
     * @return void
     * */
    @Override
    public void makeSauce() {
        this.burger.setSauce("Tomato Sauce");
    }

    /**
     * @class ChickenBugerMaker
     * @method makeBuger
     * @description 做汉堡
     * @param []
     * @return tj.sse.patterns.builder.Buger
     * */
    @Override
    public Buger makeBuger() {
        this.burger=new Buger();
        this.makeMeat();
        this.makeVeg();
        this.makeSauce();
        return this.burger;
    }
}
