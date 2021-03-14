package creational.simpleFactory;

/*
    簡單工廠
    目的：定義一個簡單工廠，傳入不同的參數取得不同的類別物件(產品)
    簡單工廠又稱為靜態工廠模式，一般來說同一工廠內所產生的類別會有一個共同的父類別(介面)

    不在GoF 23種設計模式當中
    但可以說是 三種工廠模式的基礎
    建議可以依照 簡單工廠 > 工廠方法模式 > 抽象工廠模式
    這樣的順序來進行閱讀
 */
public class SimpleFactoryMain {

    public static void main(String[] args) {

        System.out.println(SimpleFactory.getProduct(ProductType.鍵盤).describe());
        System.out.println(SimpleFactory.getProduct(ProductType.滑鼠).describe());

    }
}
