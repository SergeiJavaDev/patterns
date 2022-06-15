package com.company;

import com.company.json_data.JsonData;
import com.company.json_data.Zakrep;

public class Main {

    public static void main(String[] args) {




//        Controller controller = new Controller();
////        controller.parserRun();
////        controller.fileRun();
////        controller.fullArticleRun();
//        controller.imageRun();


//    FileOutput fileOutput = new FileOutput();
//    fileOutput.imageOutput();
//    fileOutput.methodOutput();
//        JsonData jsonData = new JsonData();
//        jsonData.JsonConnect();
        Zakrep zakrep = new Zakrep();
        zakrep.JsonConnect();
    }
}
