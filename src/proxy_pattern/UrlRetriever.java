package proxy_pattern;

public interface UrlRetriever {
    public String getPage(String url) throws InterruptedException;
}
