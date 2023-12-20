package org.proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider{

    private List<String> blockedSites= Arrays.asList("twitter","youtube","facebook");
    @Override
    public String serveSite(String url) {
        internetLog(url);
        if (blockedSites.contains(url))
        return "This Website is blocked";
        return new Zain().serveSite(url);
    }

    private void internetLog(String url) {
        System.out.printf("[%d] -> %s requested \n", System.currentTimeMillis(), url);
    }
}
