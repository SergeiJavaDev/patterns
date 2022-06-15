package com.company;

import com.company.html.ArticleSize;
import com.company.html.FullArticle;
import com.company.html.ModulesParser;

public class Controller {


        Parser parser = new Parser();
        private int indexSize;
        private final String url = "https://www.goha.ru/news";
        private ModulesParser modulesParser;


        public void indexSize() {


                ArticleSize articleSize = new ArticleSize(url, 0);
                articleSize.artSize();
                indexSize = articleSize.getSize();

        }






        public void parserRun(){
                indexSize();
                Runnable runnable = new Runnable() {
                        @Override
                        public void run() {
             for (int i = 0; i<indexSize; i ++) {
                     modulesParser = new ModulesParser(url, i);
                     System.out.println(modulesParser.data());
                     System.out.println(modulesParser.title());
                     System.out.println(modulesParser.shortlyMethod());
                     System.out.println(modulesParser.commentsMethod());
                     System.out.println(modulesParser.viewsMethod());
                     System.out.println("-----------------------------");
             }
                        }
                };

                Thread secThread = new Thread(runnable);
                secThread.start();
        }


        public void fileRun() {
                indexSize();
                Runnable runnable = new Runnable() {
                        @Override
                        public void run() {

                for (int i = 0 ; i<indexSize; i ++){
                        modulesParser = new ModulesParser(url, i);


                        FileOutput fileOutput = new FileOutput(modulesParser.data(), modulesParser.title(), modulesParser.shortlyMethod(), modulesParser.commentsMethod(), modulesParser.viewsMethod());
                        fileOutput.methodOutput();
        }
                        }
                };

                Thread secThread = new Thread(runnable);
                secThread.start();
}

        public void fullArticleRun(){
                indexSize();
           for (int i = 0; i<indexSize; i ++) {
                   FullArticle fullArticle = new FullArticle(url, i);
                   System.out.println(fullArticle.jump());
                   System.out.println(fullArticle.jump2());
           }

        }

        public void imageRun(){

                ImageHref imageHref = new ImageHref(url, 0);

                System.out.println(imageHref.imageHrefMethod());

        }
}