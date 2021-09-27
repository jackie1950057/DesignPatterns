package tj.sse.patterns.builder;

/**
 * @author DOGGY_LEE
 * @date 2021/9/27 16:23
 * @description 虾仁堡
 */
public class ShrimpBugerMaker implements BugerMaker{
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
        this.burger.setMeat("Shrimp");
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
        this.burger.setVeg("Spinach");
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
        this.burger.setSauce("Chilli Sauce");
    }

    @Override
    public Buger makeBuger() {
        this.burger=new Buger();
        this.makeMeat();
        this.makeVeg();
        this.makeSauce();
        return this.burger;
    }
}
