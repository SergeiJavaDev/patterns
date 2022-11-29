package com.company.MessengerDecorator;

public class Demonstration {
    public static void main(String[] args) {
    String demoText = "Hello";
    DataSourceDecorator decorator = new CompressionDecorator(new EncriptionDecorator(new FileDataSource()));
    decorator.WriteData(demoText);
    DataSource dataSource = new FileDataSource();
        System.out.println(dataSource.ReadData());
        System.out.println(decorator.ReadData());
    }
}
