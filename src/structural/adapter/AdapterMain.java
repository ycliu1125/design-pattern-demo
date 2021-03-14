package structural.adapter;

/*
    轉接器模式 (Adapter Pattern)
    (有時也被稱為wrapper 包裝模式)
    定義：that allows the interface of an existing class to be used as another interface.
    It is often used to make existing classes work with others without modifying their source code.
    用一個介面來轉換另一個已存在的類別。
    用一個介面來包裝已存在類別使兩個不相容的類別可以共同工作。

    聽起來很抽象，來舉個例子
    咱們來看看 媒體播放器
 */
public class AdapterMain {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(MediaType.mp3, "你是人間四月天.mp3");
        player.play(MediaType.wmv, "你說呢.wmv");
        player.play(MediaType.mp4, "好好好想見到你.mp4");

    }
}
/*
    用MediaPlayer 介面來轉換是 VideoPlayer的類別。
    使其可以在MediaPlayer 的類別下共同工作。

    最底層的就是 "播放器"這個物件
    播放器中需要有 Adapter 來調節
    而Adapter 需要所有其他需要被調節的類別
    並且透過一連串的方法來判定使用哪一項具體類別來執行工作

 */
