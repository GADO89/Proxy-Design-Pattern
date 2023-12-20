package org.proxy;

import java.util.Arrays;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        List<String> sites= Arrays.asList("malikabualzait","speaktogeek","twitter","youtube","facebook");
       InternetServiceProvider isp = new InternetProxy();

       for (String site:sites){
           System.out.println(isp.serveSite(site));
       }

    }
}