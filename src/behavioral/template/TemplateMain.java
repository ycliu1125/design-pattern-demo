package behavioral.template;

/*
    範本方法/模板模式(Template Pattern)
    In Template pattern,
    an abstract class exposes defined way(s)/template(s) to execute its methods.
    Its subclasses can override the method implementation as per need
    but the invocation is to be in the same way as defined by an abstract class.

    它定義了在某些演算法下的程式骨架，把某些行為或定義推遲到子類別實現，
    所以可以很簡單的在不改變程式基礎骨架的狀況下，繼承其範本方法，拓展不同的行為方式。
 */
public class TemplateMain {

    public static void main(String[] args) {

        Game game = new FootballGame();
        game.play();
        game = new BaseballGame();
        game.play();


    }
}
