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
        String category = "������� �������";
//        Categories categories = Categories.ANIME;
        boolean isAnime  = title.contains("�����") || title.contains("����") || description.contains("�����") || description.contains("����");
        boolean isGame = title.contains("��������") || title.contains("���") || description.contains("��������") || description.contains("���");
        boolean isComputerHardware = title.contains("���������") || title.contains("���������") || description.contains("���������") || description.contains("���������") || description.contains("AMD") || description.contains("Nvidia") || description.contains("Intel");

       if (isAnime)
       {
           category = "�����";
       }
       else if (isGame)
       {
           category = "����";
       }
       else if (isComputerHardware)
       {
           category = "������������ ������";
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
