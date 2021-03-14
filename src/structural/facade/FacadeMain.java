package structural.facade;

/*
    外觀模式 (Facade Pattern)
    定義：為子系統中的一組介面提供一個統一的高層介面，使得子系統更容易使用

    將各種系統等雜亂的函數式封裝起來，
    成為一個較容易使用和理解的介面，
    Client端只要調用此一介面就可以實踐想要的功能

 */
public class FacadeMain {

    public static void main(String[] args) {

        // 僅呼叫 ShapeMaker(整理後的單一介面) 來執行各圖形的方法

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawTriangle();
        shapeMaker.drawRectangle();

    }
}
