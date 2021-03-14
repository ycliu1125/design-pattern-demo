package creational.abstractFactory;

/*
    抽象工廠
    定義：抽象工廠模式的實質是「提供介面，建立"一系列"相關或獨立的物件，而不指定這些物件的具體類。」

    解釋：
    OK  在這裡，我們的產品不會再只被稱為 "Product"，而是涉及到多種產品/產品系。
    比如說 麥當佬這家工廠可以做漢堡、薯條、可樂。
    因此，抽象工廠需要有可以取得各個"共同"產品的方法。
    這裡會說"共同"產品是因為，不只一家工廠會產生該產品系的產品，
    而要產生這個產品系，就請繼承我的抽象類。
    比較文辭的說法是，為一個產品族(漢堡、薯條、可樂)提供了統一的建立介面。
    當需要這個產品族的某一系列的時候，可以從抽象工廠中選出相應的系列建立一個具體的工廠類。

    「工廠」是建立產品（物件）的地方，其目的是將產品的"建立"與產品的"使用"分離。

 */
public class AbsFactoryMain {

    public static void main(String[] args) {

        AbstractFastFoodFactory factory = new McdFactory();
        System.out.println(factory.getBurger().toString());
        System.out.println(factory.getCola().toString());
        System.out.println(factory.getFries().toString());

        factory = new KfcFactory();
        System.out.println(factory.getBurger().toString());
        System.out.println(factory.getCola().toString());
        System.out.println(factory.getFries().toString());

    }
}

/*
    問題與討論：
    ★ 所以你們覺得抽象工廠的目的是什麼?


    ★ 與工廠方法比較又如何??

    -   仔細與工廠方法比較一下會發現
    其實抽象工廠只是把"產品" 給多樣化了
    可以想成 工廠方法只是 抽象工廠模式的精簡版
    甚至只能說是 觀念 / 精隨
    實務上幾乎會直接使用抽象工廠模式

 */

