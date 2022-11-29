package com.company.MessengerDecorator;

import javax.print.attribute.standard.Compression;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorator{

    CompressionDecorator(DataSource wrapper) {
        super(wrapper);
    }
    @Override
    public void WriteData(String data) {
        super.WriteData(compress(data));
    }

    @Override
    public String ReadData() {
        return deCompres(super.ReadData());
    }
    private String compress(String data){
        byte[] byteData = data.getBytes();
        try {
            ByteArrayOutputStream byteAr = new ByteArrayOutputStream();
            DeflaterOutputStream defOut = new DeflaterOutputStream(byteAr, new Deflater(6));
            defOut.write(byteData);
            byteAr.close();
            defOut.close();
        }catch (IOException ex ){
            ex.printStackTrace();
        }

        return null;
    }
    private String deCompres(String data){
        byte[] byteData = Base64.getDecoder().decode(data);
        try{
            int i;
            InputStream inputStream = new ByteArrayInputStream(byteData);
            InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while ((i = inflaterInputStream.read()) != -1) {
            byteArrayOutputStream.write(i);
            }
            inputStream.close();
            inflaterInputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        }catch (IOException ex){ ex.printStackTrace();}
        return null;
    }
}
