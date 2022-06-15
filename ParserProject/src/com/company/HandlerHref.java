package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HandlerHref extends Parser{
 private String titleArticle;
 private String descriptionArticle;


    public String parserHref(String h){

        try {

        Document doc = Jsoup.connect(h).get();
        Elements fullTitle = doc.getElementsByTag("h1");
            titleArticle = fullTitle.text();  // ��������� ���������


    } catch (IOException e) {
        e.printStackTrace();
    }
 return  titleArticle;
    }




    public String parserHref2(String h){

        try {
            Document doc = Jsoup.connect(h).get();

            Elements getTagP = doc.getElementsByTag("p");

            for (int i = 0; i < getTagP.size(); i++) {
                Element description = getTagP.get(i);

                if (!getTagP.text().equals("����������")
                        &&!description.text().equals("RPG")
                        &&!description.text().equals("�����������")
                        &&!description.text().equals("�����")
                        &&!description.text().equals("War Thunder")
                        &&!description.text().equals("Achilles: Legends Untold")
                        &&!description.text().equals("MMO")
                        &&!description.text().equals("������������")
                        &&!description.text().equals("�������")
                        &&!description.text().equals("Songs of Conquest")
                        &&!description.text().equals("���������")
                        &&!description.text().equals("����������")){



              //      System.out.println(description.text()); // ��������� ��������
            }
                descriptionArticle = getTagP.text();
        }
//            System.out.println(descriptionArticle);
        } catch (IOException e) {
            e.printStackTrace();
        }
         return  descriptionArticle;
    }

}
