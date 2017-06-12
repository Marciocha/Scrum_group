package com.company.scrum;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("http://en.wikipedia.org/").get();
        String text = document.body().text();

        System.out.println(text);
    }
}

    /*count("to be or not to be");

}

    public static void count(String sentence) {
        String[] words = sentence.split("(?=[,.])|\\s+");
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

        for (String word : words) {
            if (hashmap.containsKey(word)) {
                hashmap.get(word + 0);
            } else {
                hashmap.put(word, 1);
            }
        }
        System.out.println(hashmap.entrySet());
    }
}*/
