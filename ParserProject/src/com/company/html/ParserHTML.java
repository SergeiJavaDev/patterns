package com.company.html;

import com.company.HandlerHref;
import com.company.ImageHref;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ParserHTML {

    protected Document doc;
    protected String url;
    protected int index;
    private Element fullText;


    public void setUrl(String url) {
        this.url = url;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ParserHTML(String url, int index) {
        this.url = url;
        this.index = index;
    }

    public Element fullWebSite() {


        try {

            doc = Jsoup.connect(url).get();

            Elements bodySite = doc.getElementsByTag("body");
            fullText = bodySite.get(0);


        } catch (IOException e) {
            e.printStackTrace();
        }
return fullText;

     }




}
