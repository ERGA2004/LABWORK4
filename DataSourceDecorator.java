package kz.narxoz.patterns.decorator;

import kz.narxoz.patterns.decorator.examples.CryptoException;

import java.io.File;
import java.io.IOException;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}