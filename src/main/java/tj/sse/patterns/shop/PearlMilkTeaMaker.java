package tj.sse.patterns.shop;

/**
 * @author DOGGY_LEE
 * @date 2021/10/8 23:16
 * @description 珍珠奶茶
 */
public class PearlMilkTeaMaker implements MilkTeaMaker{
    /**
     * @description 奶茶
     * */
    private MilkTea milkTea;

    @Override
    public String getName() {
        return "珍珠奶茶";
    }

    @Override
    public void addSuger() {
        milkTea.suger="三分糖";
    }

    @Override
    public void addIce() {
        milkTea.ice="全冰";
    }

    @Override
    public void addItem() {
        milkTea.item="珍珠";
    }

    @Override
    public MilkTea makeMilkTea() {
        milkTea=new MilkTea();
        addSuger();
        addIce();
        addItem();
        return milkTea;
    }
}
