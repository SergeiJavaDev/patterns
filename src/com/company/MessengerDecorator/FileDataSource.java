package com.company.MessengerDecorator;

import java.io.*;

public class FileDataSource implements DataSource {
String fileName = "out/Text.txt";
    @Override
    public void WriteData(String data) {
    File file = new File(fileName);
    try {
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write(data.getBytes(), 0, data.length());
    }catch (IOException ex){ex.printStackTrace();}
    }

    @Override
    public String ReadData() {
        File file = new File(fileName);
        char[] charsAr = null;
        try {
            FileReader reader = new FileReader(file);
            charsAr = new char[(int)file.length()];
            reader.read(charsAr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(charsAr).intern();
    }
}
