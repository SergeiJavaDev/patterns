package com.company.MessengerDecorator;

import java.util.Base64;

public class EncriptionDecorator extends DataSourceDecorator {

    EncriptionDecorator(DataSource wrapper) {
        super(wrapper);

    }
    @Override
    public void WriteData(String data) {
        super.WriteData(encode("Hello"));
    }

    @Override
    public String ReadData() {
        return decode(super.ReadData());
    }

    private String encode(String data){

        byte[] result = data.getBytes();
        return Base64.getEncoder().encodeToString(result);
    }
    private  String decode (String data){
        byte[] result = Base64.getDecoder().decode(data);

        return new String(result).intern();
    }
}
