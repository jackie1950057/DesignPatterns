package tj.sse.patterns.singleton;

/**
 * @author DOGGY_LEE
 * @date 2021/9/26 20:44
 * @description 单例模式样例类
 */
public class Singleton
{
    /**
     * @description 静态实例
     * */
    private final static Singleton instance = new Singleton();

    /**
     * @class Singleton
     * @method Singleton
     * @description 构造函数私有化
     * @param []
     * @return
     * */
    private Singleton(){}

    /**
     * @class Singleton
     * @method getInstance
     * @description 获取全局实例
     * @param []
     * @return tj.sse.patterns.singleton.Singleton
     * */
    public static Singleton getInstance()
    {
        return instance;
    }

}
