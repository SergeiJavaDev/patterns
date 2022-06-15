package com.company;
import com.company.enum_categories.Categories;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutput{

    private String date;
    private String title;
    private String description;
    private String views;
    private String comments;

    public FileOutput(String date, String title, String description, String views, String comments) {
        this.date = date;
        this.title = title;
        this.description = description;
        this.views = views;
        this.comments = comments;
    }

    public void imageOutput(){
//        ImageHref imageHref = new ImageHref();








//        String urlImage = imageHref.imageArticle();
       /* try {

            URL url = new URL("https://www.goha.ru/s/A:CM/73/UoXu3H8xKX.jpg");

                    BufferedImage image = ImageIO.read(url);

            if (image != null){

                ImageIO.write(image, "jpg",new File("C:\\Users\\Segey\\Desktop\\number.jpg"));



            }


        } catch (IOException e) {
            e.printStackTrace();
        }
*/
    }
    public void methodOutput(){
        String category = "Игровые новости";
//        Categories categories = Categories.ANIME;
        boolean isAnime  = title.contains("Аниме") || title.contains("Манг") || description.contains("Аниме") || description.contains("Манг");
        boolean isGame = title.contains("Видеоигр") || title.contains("Игр") || description.contains("Видеоигр") || description.contains("Игр");
        boolean isComputerHardware = title.contains("Видеокарт") || title.contains("Процессор") || description.contains("Видеокарт") || description.contains("Процессор") || description.contains("AMD") || description.contains("Nvidia") || description.contains("Intel");

       if (isAnime)
       {
           category = "Аниме";
       }
       else if (isGame)
       {
           category = "Игры";
       }
       else if (isComputerHardware)
       {
           category = "Компьютерное железо";
       }


                try(FileWriter writer = new FileWriter("C:\\Users\\Segey\\Desktop\\number.doc", true))
                {

                    String text = "\n" + "\n" + category  + "\n" +  "\n" + date + "\n" + "\n" + title +"\n" +"\n" + description  +"\n" +"\n" + views  +"\n" +"\n" + comments +"\n"+ "______________________"+"\n";
                    writer.write(text);
                    writer.flush();
                }




                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }



    }







}
