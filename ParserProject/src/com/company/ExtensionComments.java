package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ExtensionComments extends Parser {




    public void CommentsForumMethod(){
        try {
            doc = Jsoup.connect(URL_FULL).get();

            Elements comments  = doc.getElementsByClass("vbutton secondary");
            System.out.println(comments);
//            Element getComments = comments.get(index);  // Парсинг заголовков по индексу 0,1,2,3,4,5...
            for (int i = 0; i < comments.size(); i++) {
                Element forum = comments.get(i);

                if (forum.text().contains("forums"));
                System.out.println(forum);
            }




        } catch (IOException e) {
            e.printStackTrace();

        }
    }





}
