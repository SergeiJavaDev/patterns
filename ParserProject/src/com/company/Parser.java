package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Parser {
    protected String url;
    protected int index;
    protected Document doc;
    public static String URL_FULL;

    public String Description2;
    public String Views2;
    public String Comments2;
    public String Date2;
    private String titleArticle;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String jSoupMethod(){

        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {*/
                try {
                    doc = Jsoup.connect(url).get();

                    Elements title = doc.getElementsByClass("title");
           /* Elements shortly  = doc.getElementsByClass("shortly");
            Elements date  = doc.getElementsByClass("date");
            Elements views  = doc.getElementsByClass("views");
            Elements comments  = doc.getElementsByClass("comments");
            Elements forum = doc.getElementsByClass("forum");*/


                    Element getTitle = title.get(index);  // Парсинг заголовков по индексу 0,1,2,3,4,5...
                    Elements getTagA = getTitle.getElementsByTag("a");
                    String titleHref = getTagA.attr("href");
                    //  System.out.println(titleHref);  // Получение ссылки на полную статью из заголовка
/*
                    HandlerHref handlerHref = new HandlerHref(); // Вызов класса для обработки ссылки

                    handlerHref.parserHref(titleHref); // Вызов метода заголовка
                    handlerHref.parserHref2(titleHref); // Вызов метода описания


                    titleArticle = handlerHref.parserHref(titleHref);
                    ImageHref imageHref = new ImageHref();
                    imageHref.imageArticle(doc);*/

                } catch (IOException e) {
                    e.printStackTrace();
                }
//            }
//        };

//        Thread secThread = new Thread(runnable);
//        secThread.start();




        return titleArticle;
    }




    @Deprecated
    public String ShortlyMethod(){
       /* Runnable runnable = new Runnable() {
            @Override
            public void run() {*/
                try {
                    doc = Jsoup.connect(url).get();

                    Elements shortly  = doc.getElementsByClass("shortly");

                    Element getShortly = shortly.get(index);  // Парсинг заголовков по индексу 0,1,2,3,4,5...

                    //  System.out.println(getShortly.text());
                    Description2 = getShortly.text();

                } catch (IOException e) {
                    e.printStackTrace();

                }
            /*}
        };

        Thread secThread = new Thread(runnable);
        secThread.start();*/

return Description2;
}

    @Deprecated
    public String ViewsMethod(){
       /* Runnable runnable = new Runnable() {
            @Override
            public void run() {*/
                try {
                    doc = Jsoup.connect(url).get();

                    Elements views  = doc.getElementsByClass("views");

                    Element getViews = views.get(index);  // Парсинг заголовков по индексу 0,1,2,3,4,5...
                    Views2 = getViews.text();
                    //      System.out.println(getViews.text());


                } catch (IOException e) {
                    e.printStackTrace();

                }
           /* }
        };

        Thread secThread = new Thread(runnable);
        secThread.start();*/

        return Views2;
    }

    @Deprecated
    public String DateMethod(){
       /* Runnable runnable = new Runnable() {
            @Override
            public void run() {*/
                try {
                    doc = Jsoup.connect(url).get();

                    Elements date  = doc.getElementsByClass("date");

                    Element getDate = date.get(index);  // Парсинг заголовков по индексу 0,1,2,3,4,5...

                    Date date1 = new Date();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd | MM | yyyy |", Locale.ENGLISH );
                    String s = dateFormat.format(date1);
                    Date2 = getDate.text().replace("Сегодня", s);
                    //       System.out.println(Date2);
                } catch (IOException e) {
                    e.printStackTrace();

                }
          /*  }
        };

        Thread secThread = new Thread(runnable);
        secThread.start();*/

        return Date2;
    }
    @Deprecated
    public String CommentsMethod(){
        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {*/
                try {
                    doc = Jsoup.connect(url).get();

                    Elements comments  = doc.getElementsByClass("comments");

                    Element getComments = comments.get(index);  // Парсинг заголовков по индексу 0,1,2,3,4,5...
                    String rp = getComments.text().replace("question_answer", "Комменарии: ");
                    Comments2= rp;

                } catch (IOException e) {
                    e.printStackTrace();

                }
           /* }
        };

        Thread secThread = new Thread(runnable);
        secThread.start();*/

        return Comments2;
    }

    @Deprecated
    public void ForumMethod(){
        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {*/
                try {
                    doc = Jsoup.connect(url).get();

                    Elements forum = doc.getElementsByClass("forum");

                    Element getForum = forum.get(index);  // Парсинг заголовков по индексу 0,1,2,3,4,5...
                    //   System.out.println(getForum.text());


                } catch (IOException e) {
                    e.printStackTrace();

                }
//            }
//        };

//        Thread secThread = new Thread(runnable);
//        secThread.start();


    }
    }


