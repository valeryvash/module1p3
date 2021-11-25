package main.java.com.valeryvash.javacore.chapter22;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://www.google.com");

        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        System.out.println("Method request: " + hpCon.getRequestMethod());
        System.out.println("Answer code : " + hpCon.getResponseCode());
        System.out.println("Answer message : " + hpCon.getResponseMessage());

        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();

        System.out.println("The header follows next");

        for (String k : hdrField) {
            System.out.println("Key: " + k + " Value: " + hdrMap.get(k));
        }



    }
}
