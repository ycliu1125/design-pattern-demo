package behavioral.chainOfResponsibility;

/*
    責任練模式 (Chain of Responsibility)
    定義：使多個物件都有機會處理請求，從而避免請求的發送者和接收者之間的耦合關係。
    將這個物件連成一條鏈，並沿著這條鏈傳遞該請求，直到有一個物件處理它為止。

    念起來有點文言
    責任鍊的行為大致上如下：
    Handler是請求的接收者，Handler接收到請求(Request)後
    假如可以處理則處理之，不能處理則將這個請求發送給後繼者。

    重點有三
    1. 判斷是否可以處理的依據
    2. 下一位處理者是否存在
    3. 誰要當開頭

 */
public class CorMain {

    public static void main(String[] args) {

        // 直接用最高的???
        AbstractLogger loggerChain = new ErrorLogger();

        loggerChain.logMessage(AbstractLogger.ERROR, " Error 發生...");
        loggerChain.logMessage(AbstractLogger.INFO, " Some information...");
        loggerChain.logMessage(AbstractLogger.TRACE, " Trace something...");
    }

}
