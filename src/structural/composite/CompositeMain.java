package structural.composite;

/*
    組合模式 (Composite Pattern)
    通常當物件有從屬關係的時候
    將物件組合成樹形結構以表示「部分 - 整體」的層次結構。

    在組合模式中所有的物件都是整體的一部分，而整體是物件的集合。

 */
public class CompositeMain {

    public static void main(String[] args) {

        District taiwan = new District("台灣");

        District taipei = new District("台北");
        District taichung = new District("台中");

        District banchou = new District("板橋");
        District oneOone = new District("台北101");
        District shalu = new District("沙鹿");
        District wuchi = new District("梧棲");

        taiwan.add(taipei);
        taiwan.add(taichung);

        taipei.add(banchou);
        taipei.add(oneOone);
        taichung.add(shalu);
        taichung.add(wuchi);


        taiwan.command("衝R~!!!");

        taipei.command("台北天龍國!!");

        taichung.command("台中人看海景!!!");


    }
}
