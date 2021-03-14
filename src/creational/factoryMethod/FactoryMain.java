package creational.factoryMethod;

/*
    工廠方法模式：
        定義：提供一個建立物件的介面(或是說取得物件的方法)，
        由實作這個介面的子類(工廠)別來決定具體要取得哪一個物件，
        而不是藉由各自物件的建構子取得。
 */
public class FactoryMain {

    public static void main(String[] args) {

        Factory macFactory = new MacFactory();
        System.out.println(macFactory.getProduct().describe());

        Factory winFactory = new WinFactory();
        System.out.println(winFactory.getProduct().describe());

    }
}

/*
    MacFactory 和 WinFactory
    都實作了 <interface>Factory 中的 getProduct() 方法
    由MacFactory 和 WinFactory 決定要取得的具體物件。
 */

/*
    那麼問題來了
    ★ 在網路上有看到其他篇有提到
    "在使用工廠模式時，可能會向工廠提出想要某種規格的產品，
    而工廠需要負責製造，我們想要的規格的產品"
    所以他多載了 getProduct()方法並賦予參數。例如：getProduct(String type)
    或者甚至 getMainProduct(), getMinorProduct() ...
    這也算是工廠模式的一部分嗎?

    -   我覺得不是，畢竟定義只有指出需要由子類別去決定取得的具體物件。
    並沒有規範到"規格"這一塊。
    我想之後的某個設計模式會有類似的功能/達成這個目的的手段。

    -   另外他也有提到說 "工廠會return 我們想要的東西"
    或許是為後面的某些模式 建立觀念吧?


    ★ 使用的情境呢??


 */
