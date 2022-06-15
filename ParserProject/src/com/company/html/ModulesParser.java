package com.company.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ModulesParser extends ParserHTML {

    private Element fullText = super.fullWebSite();
    private String dataText;
    private String titleText;
    private String shortlyText;
    private String viewsText;
    private String commentsText;


    public ModulesParser(String url, int index) {
        super(url, index);

    }

    public String data() {


        Elements date = fullText.getElementsByClass("date");

        Element getDate = date.get(index);
        dataText = getDate.text();


        return dataText;
    }

    public String title() {


        Elements title = fullText.getElementsByClass("title");

        Element getDate = title.get(index);
        titleText = getDate.text();


        return titleText;
    }

    public String shortlyMethod() {


        Elements shortly = fullText.getElementsByClass("shortly");

        Element getShortly = shortly.get(index);
        shortlyText = getShortly.text();


        return shortlyText;
    }

    public String viewsMethod() {


        Elements views = fullText.getElementsByClass("views");

        Element getViews = views.get(index);
        viewsText = getViews.text();


        return viewsText;

    }

    public String commentsMethod() {


        Elements comments = fullText.getElementsByClass("comments");

        Element getComments = comments.get(index);
        commentsText = getComments.text().replace("question_answer", "Комменарии: ");

        return commentsText;

    }

}
