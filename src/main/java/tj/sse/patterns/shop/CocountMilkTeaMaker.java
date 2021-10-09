package tj.sse.patterns.shop;

/**
 * @author DOGGY_LEE
 * @date 2021/10/9 14:25
 * @description 椰果奶茶
 */
public class CocountMilkTeaMaker implements MilkTeaMaker{
    /**
     * @description 奶茶
     * */
    private MilkTea milkTea;

    @Override
    public String getName() {
        return "椰果奶茶";
    }

    @Override
    public void addSuger() {
        milkTea.suger="全糖";
    }

    @Override
    public void addIce() {
        milkTea.ice="七分冰";
    }

    @Override
    public void addItem() {
        milkTea.item="椰果";
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
