package creational.builder;

/*
    建造者模式 (Builder Pattern)
    定義：是設計來提供一個有彈性解決方案，用OOP的方式來解決一個不同(複雜)物件的創造。
    目的是為了要分離一個複雜物品的"建造"和"表示建造"的方式。

在介紹BuilderPattern 之前，可以先回想一下
    各位目前會用到的Builder 有哪些? 例如: StringBuilder, ProcessBuilder ...
    是否觀察到一點: "builder 物件執行方法的回傳值  還是他自己"
    這點很重要

    在這裡會有四種角色: 抽象建造者, 實際執行建造方法的建造者, 產品 以及 服務生
    "服務生" 可以使用各種Builder 來建立產品
    而客戶端只需要告訴服務生 需要什麼產品
 */
public class BuilderMain {

    public static void main(String[] args) {

        AbstractWebApplicationBuilder webApplicationBuilder = new WebApplicationBuilder();
        WebProgrammer programmer = new WebProgrammer(webApplicationBuilder);

        System.out.println(programmer.createBlogWebSite().toString());
        System.out.println(programmer.createShoppingWebSite().toString());

    }
}
