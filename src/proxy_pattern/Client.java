package proxy_pattern;

import java.util.List;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws InterruptedException {
       Stack<Integer> stack = new Stack<>();
        UrlRetriever urlRetriever = new ProxyUrlRetriever();
        String page = urlRetriever.getPage("www.google.com");
        System.out.println(page);
        TimeUnit.SECONDS.sleep(4);
        page = urlRetriever.getPage("www.google.com");
        System.out.println(page);
        TimeUnit.SECONDS.sleep(6);
        page = urlRetriever.getPage("www.google.com");
        System.out.println();
    }
}
