package proxy_pattern;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class ProxyUrlRetriever implements UrlRetriever{
    RealUrlRetriever realUrlRetriever = new RealUrlRetriever();
    Map<String,String> currentPages = new HashMap<String, String>();
    Map<String,Long> pagesRetrievalTime = new HashMap<String, Long>();


    @Override
    public String getPage(String url) throws InterruptedException {
        if(currentPages.containsKey(url)){
            if(System.currentTimeMillis() - pagesRetrievalTime.get(url) <= 5000){
                pagesRetrievalTime.replace(url,System.currentTimeMillis());
                System.out.println("hello from proxy");
                return currentPages.get(url);
            }
            else{
                 String newUrl = realUrlRetriever.getPage(url);
                 pagesRetrievalTime.replace(newUrl,System.currentTimeMillis());
                 return newUrl;
            }
        }
        else{
            String page = realUrlRetriever.getPage(url);
            currentPages.put(url,page);
            pagesRetrievalTime.put(url,System.currentTimeMillis());
            return page;
        }
    }
}
