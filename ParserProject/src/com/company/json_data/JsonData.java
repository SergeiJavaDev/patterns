package com.company.json_data;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.json.JSONException;
import org.json.JSONObject;
public class JsonData {
    private StringBuilder response;
    public void JsonConnect() {

    String theme = "game";

        Date date1 = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH );
        String today = dateFormat.format(date1);

        String url = "https://newsapi.org/v2/everything?q="+ theme +"&from="+ today +"&sortBy=publishedAt&apiKey=7d4d31c1a4214621914f83bad6cb0076";
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
        JSONObject  jsonData = new JSONObject(String.valueOf(response));

    int index = jsonData.getJSONArray("articles").length();

for (int i = 0; i<index; i ++) {
    String content = jsonData.getJSONArray("articles").getJSONObject(i).getString("content");
    String publishedAt = jsonData.getJSONArray("articles").getJSONObject(i).getString("publishedAt");
    String url1 = jsonData.getJSONArray("articles").getJSONObject(i).getString("url");
//    String author = jsonData.getJSONArray("articles").getJSONObject(i).getString("author");
    String title = jsonData.getJSONArray("articles").getJSONObject(i).getString("title");
    String name = jsonData.getJSONArray("articles").getJSONObject(i).getJSONObject("source").getString("name");
    String description = jsonData.getJSONArray("articles").getJSONObject(i).getString("description");
//        String urlToImage = jsonData.getJSONArray("articles").getJSONObject(i).getString("urlToImage");
    System.out.println(publishedAt);
}
    }


}
