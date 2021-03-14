package structural.bridge;

/*
    橋接模式 (Bridge Pattern)
    是軟體設計模式中最複雜的模式之一，
    定義：把事物對象和其具體行爲、具體特徵分離開來，使它們可以各自獨立的變化。

    使用的情境與狀況
    1.A+B才是一個完整的物件，但是A和B又分別有各種不同的實現時。
    2.這種方式可以很輕鬆地組合出每個自己想要的狀況(或是產品)，而不用針對每個狀況去寫一個特例。

    橋接模式(跟組合模式...等其他模式)試著解決問題時有遵守「多用組合、少用繼承」原則。
    也就是盡量使用組合(聚合)來代替類別繼承。
    組合有點像"依賴"的概念，利用依賴將他們橋接起來。

    既然是橋接模式，那我們就來造橋吧~~
 */
public class BridgeMain {

    public static void main(String[] args) {

        Builder veryGoodBuilder = new VeryGoodBuilder(new Bridge());
        veryGoodBuilder.buildSomething();
        veryGoodBuilder.setBuilding(new Church());
        veryGoodBuilder.buildSomething();

        Builder veryBadBuilder = new VeryBadBuilder(new Bridge());
        veryBadBuilder.buildSomething();
        veryBadBuilder.setBuilding(new Church());
        veryBadBuilder.buildSomething();

    }
}

/*
    其實我覺得橋接模式
    已經像是一般的依賴注入了欸
 */
