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



        Element getTitle = title.get(index);  // ������� ���������� �� ������� 0,1,2,3,4,5...
        Elements getTagA = getTitle.getElementsByTag("a");
        String titleHref = getTagA.attr("href");
//          System.out.println(titleHref);  // ��������� ������ �� ������ ������ �� ���������

        HandlerHref handlerHref = new HandlerHref(); // ����� ������ ��� ��������� ������

        fullTitle = handlerHref.parserHref(titleHref); // ����� ������ ���������



        /* titleArticle = handlerHref.parserHref(titleHref);
         ImageHref imageHref = new ImageHref();
         imageHref.imageArticle(doc);*/


    return fullTitle; }

    public String jump2(){


        Elements title = fullText.getElementsByClass("title");



        Element getTitle = title.get(index);  // ������� ���������� �� ������� 0,1,2,3,4,5...
        Elements getTagA = getTitle.getElementsByTag("a");
        String titleHref = getTagA.attr("href");
//        System.out.println(titleHref);  // ��������� ������ �� ������ ������ �� ���������

        HandlerHref handlerHref = new HandlerHref(); // ����� ������ ��� ��������� ������



        fullDescription = handlerHref.parserHref2(titleHref); // ����� ������ ��������


        /* titleArticle = handlerHref.parserHref(titleHref);
         ImageHref imageHref = new ImageHref();
         imageHref.imageArticle(doc);*/


        return fullDescription; }

}
