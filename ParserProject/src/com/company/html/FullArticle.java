package com.company.html;

import com.company.HandlerHref;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FullArticle extends ParserHTML {
    private Element fullText = super.fullWebSite();
    private String fullTitle;
    private String fullDescription;

    public FullArticle(String url, int index) {
        super(url, index);
    }

    public String jump(){


        Elements title = fullText.getElementsByClass("title");



        Element getTitle = title.get(index);  // Парсинг заголовков по индексу 0,1,2,3,4,5...
        Elements getTagA = getTitle.getElementsByTag("a");
        String titleHref = getTagA.attr("href");
//          System.out.println(titleHref);  // Получение ссылки на полную статью из заголовка

        HandlerHref handlerHref = new HandlerHref(); // Вызов класса для обработки ссылки

        fullTitle = handlerHref.parserHref(titleHref); // Вызов метода заголовка



        /* titleArticle = handlerHref.parserHref(titleHref);
         ImageHref imageHref = new ImageHref();
         imageHref.imageArticle(doc);*/


    return fullTitle; }

    public String jump2(){


        Elements title = fullText.getElementsByClass("title");



        Element getTitle = title.get(index);  // Парсинг заголовков по индексу 0,1,2,3,4,5...
        Elements getTagA = getTitle.getElementsByTag("a");
        String titleHref = getTagA.attr("href");
//        System.out.println(titleHref);  // Получение ссылки на полную статью из заголовка

        HandlerHref handlerHref = new HandlerHref(); // Вызов класса для обработки ссылки



        fullDescription = handlerHref.parserHref2(titleHref); // Вызов метода описания


        /* titleArticle = handlerHref.parserHref(titleHref);
         ImageHref imageHref = new ImageHref();
         imageHref.imageArticle(doc);*/


        return fullDescription; }

}
