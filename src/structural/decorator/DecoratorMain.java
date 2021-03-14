package structural.decorator;

/*
    裝飾者模式 (Decorator Pattern)

    定義：允許動態的往一個類中添加新的行為的設計模式。
    就增加功能來說，裝飾模式相比產生子類別更為靈活。

    特色：
    1.裝飾的順序和內容會影響到表現。
    2.裝飾模式的角色有元件和裝飾，裝飾需要建構在被裝飾的元件上。
    3.是一種繼承關係的替代方案。
    4.裝飾物不同但是元件的本質不變。


 */
public class DecoratorMain {

    public static void main(String[] args) {

        LedToy poi = new LedPoi();
        LedToy poiWithFlash = new FlashDecorator(new LedPoi());
        LedToy stickWithFlash = new FlashDecorator(new LedStick());

        poi.play();
        poiWithFlash.play();
        stickWithFlash.play();
    }

}

/*

    Decorator Pattern其實是要為了減少或替代繼承的使用
    注意 要裝飾上去的功能必須是針對 介面 設計
    例如 閃爍的功能必須是實作 LED Toy 的類別都可以使用的

    但這樣裝飾一個功能就要寫一個類別...嗎?
    能不能有一個類別可以裝飾n種功能上去呢?

    裝飾模式可以把類別中的裝飾功能從類別中搬移去除，
    這樣可以簡化原有類別。也就是把類別中核心職責和裝飾功能區分開，
    並去除相關內別中重複的邏輯。


 */