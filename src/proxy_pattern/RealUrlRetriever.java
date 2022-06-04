package proxy_pattern;

import java.util.concurrent.TimeUnit;

public class RealUrlRetriever implements UrlRetriever{
    @Override
    public String getPage(String url) throws InterruptedException {
        // sleep represents the time time required to get the url page
        TimeUnit.SECONDS.sleep(5);
        System.out.println("hello from RealUrlRetriever");
        return "<html>"+ url+"</html>";
    }
}
