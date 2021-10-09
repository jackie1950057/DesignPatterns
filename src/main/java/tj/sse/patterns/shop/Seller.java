package tj.sse.patterns.shop;

/**
 * @author DOGGY_LEE
 * @date 2021/10/8 21:06
 * @description 饮料贩卖机
 */
public class Seller {
    /**
     * @description 货架
     * */
    private Shelf []shelves;

    private MilkTeaMaker []milkTeaMakers;


    public Seller(){
        shelves=new Shelf[]{new CokeShelf(),new FantaShelf()};
        milkTeaMakers= new MilkTeaMaker[]{new PearlMilkTeaMaker(), new CocountMilkTeaMaker()};
    }
    
    /**
     * @class Seller
     * @method getFood
     * @description 输入货架号获取食物
     * @param [index]
     * @return tj.sse.patterns.shop.Food
     * */
    public Food getFood(String name){
        for(Shelf shelf:shelves){
            if(shelf.getName()==name)
                return shelf.getFood();
        }
       return null;
    }

    /**
     * @class Seller
     * @method getMikeTea
     * @description 制作奶茶
     * @param [maker]
     * @return tj.sse.patterns.shop.MilkTea
     * */
    private MilkTea getMikeTea(MilkTeaMaker maker){
        return maker.makeMilkTea();
    }

    /**
     * @class Seller
     * @method getMilkTea
     * @description 通过名字买奶茶
     * @param [name]
     * @return tj.sse.patterns.shop.MilkTea
     * */
    public MilkTea getMilkTea(String name){
        for(MilkTeaMaker maker:milkTeaMakers){
            if(maker.getName()==name)
                return getMikeTea(maker);
        }
        return null;
    }
}
