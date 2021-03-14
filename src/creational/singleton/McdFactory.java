package creational.singleton;


/*
 這裡我們 麥當佬當作 統一的SingletonFactory
 旗下有"自己的" 漢堡工廠 可樂工廠 -> 所以要Singleton

 那麥當佬 自己如何取得產品呢?
 就像這樣
 McdFactory.getBurgerFactory().getProduct();
 McdFactory.getColaFactory().getProduct();

 所以咱們第一步 => 把漢堡、可樂工廠 Singleton 起來
 第二步 讓McdFactory 可以取得漢堡、可樂工廠

 */

public class McdFactory {

    public static SingletonFactory getBurgerFactory() {
        return BurgerFactory.getInstance();
    }

    public static SingletonFactory getColaFactory() {
        return ColaFactory.getInstance();
    }

    // 這裡使用 內部靜態類別 表示這兩個單例工廠專屬 Mcd 這個廠牌，別人不能用
    private static class BurgerFactory implements SingletonFactory {

        private BurgerFactory() {
        }

        private static BurgerFactory burgerFactory = new BurgerFactory();

        public static BurgerFactory getInstance() {
            return burgerFactory;
        }

        @Override
        public McdProduct getProduct() {
            return new Burger();
        }
    }

    private static class ColaFactory implements SingletonFactory {

        private ColaFactory() {
        }

        private static ColaFactory colaFactory = new ColaFactory();

        public static ColaFactory getInstance() {
            return colaFactory;
        }

        @Override
        public McdProduct getProduct() {
            return new Cola();
        }
    }
}
