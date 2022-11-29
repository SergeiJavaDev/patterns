package com.company.MessengerDecorator;

public interface DataSource {

    void WriteData(String data);
    String ReadData();
}
class DataSourceDecorator implements DataSource{
    private final DataSource wrapper;

    DataSourceDecorator(DataSource wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void WriteData(String data) {
        wrapper.WriteData(data);
    }

    @Override
    public String ReadData() {
        return wrapper.ReadData();
    }
}

