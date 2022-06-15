package com.company;

import com.company.html.ParserHTML;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ImageHref extends ParserHTML {
    private Element fullText = super.fullWebSite();

    public ImageHref(String url, int index) {
        super(url, index);
    }

    public String imageHrefMethod(){

        Elements image = fullText.getElementsByClass("image");
        Element getImage = image.get(0);
        Elements imageHref = getImage.getElementsByClass("img");


        return imageHref.toString();
    }





    public String imageArticle (Document document) {

        Elements imageHref = document.getElementsByAttribute("src");

        Element imageIndex = imageHref.get(0);


        Elements image1 = document.getElementsByClass("lazy");
        Element image2 = image1.get(2);
        String href = image2.attr("src");
//        System.out.println(href);

        return href;




    }

    }

