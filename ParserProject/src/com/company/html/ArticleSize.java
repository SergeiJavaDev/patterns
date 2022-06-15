package com.company.html;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ArticleSize extends ParserHTML {
    private Element fullText = super.fullWebSite();
    public int size;
    public ArticleSize(String url, int index) {
        super(url, index);
    }

    public void artSize(){

        Elements title = fullText.getElementsByClass("views");


           for (int i = 0; i<title.size(); i ++){
               size = i;

           }
//        System.out.println(size);

   }

    public int getSize() {
        return size;
    }
}
