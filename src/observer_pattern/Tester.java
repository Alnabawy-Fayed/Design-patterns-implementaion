package observer_pattern;

public class Tester {
    public static void main(String[] args) {
        ManWithNews manWithNews = new ManWithNews();
        Lover shyLover = new ShyLover(manWithNews);
        manWithNews.setCrushesNews();
        manWithNews.notifyAllLovers();
        shyLover.unSubscribe();
        manWithNews.notifyAllLovers();
    }
}
