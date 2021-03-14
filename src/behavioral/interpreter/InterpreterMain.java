package behavioral.interpreter;

/*
    直譯器模式 (Interpreter Pattern)
    provides a way to evaluate language grammar or expression.

    This pattern is used in SQL parsing, symbol processing engine etc.

    在這個模式中 我們需要一個固定的終端接口(TerminalExpression)
    以及數個自訂義演算法邏輯 並回傳結果的具體Expression

 */
public class InterpreterMain {

    public static void main(String[] args) {

        Expression isMale = getMaleExpression();
        System.out.println("Is \"1\" means male? " + isMale.interpret("1"));
        System.out.println("Is \"M\" means male? " + isMale.interpret("M"));
        System.out.println("Is \"0\" means male? " + isMale.interpret("0"));
        System.out.println("Is \"F\" means male? " + isMale.interpret("F"));

        // 假設Susan 今天穿白色衣服而且是棕色頭髮
        Expression isSusan = getSusanExpression();
        System.out.println("Is that brown hair with white wearing girl Susan? " +
            isSusan.interpret("Is that brown hair with white wearing girl Susan? "));
        System.out.println("Is that brown hair with green wearing girl Susan? " +
            isSusan.interpret("Is that brown hair with green wearing girl Susan? "));
        System.out.println("Is that black hair with white wearing girl Susan? " +
            isSusan.interpret("Is that black hair with white wearing girl Susan? "));
        System.out.println("Is that black hair with green wearing girl Susan? " +
            isSusan.interpret("Is that black hair with green wearing girl Susan? "));

    }

    public static Expression getMaleExpression() {
        Expression m = new TerminalExpression("M");
        Expression one = new TerminalExpression("1");
        return new OrExpression(m, one);
    }

    public static Expression getSusanExpression() {
        Expression hair = new TerminalExpression("brown");
        Expression wearing = new TerminalExpression("white");
        return new AndExpression(hair, wearing);
    }
}
