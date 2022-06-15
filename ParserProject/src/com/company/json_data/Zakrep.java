package com.company.json_data;

import org.json.JSONObject;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Zakrep {

    private StringBuilder response;
    public void JsonConnect() {


String hello = "hello";

//        while (true) {
        String url = "https://dictionary.yandex.net/dicservice.json/queryCorpus?lang=en-ru&src="+ hello;
        try {
            URL obj = new URL(url);

            HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);     // Переменная response
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject jsonData = new JSONObject(String.valueOf(response));




            String text = jsonData.getJSONArray("result").getJSONObject(0).getString("text");
        String text2 = jsonData.getJSONArray("result").getJSONObject(0).getJSONObject("translation").getString("text");
            System.out.println(text2);
        }
    }
//}
