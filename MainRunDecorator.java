package kz.narxoz.patterns.decorator;

import kz.narxoz.patterns.decorator.examples.CryptoException;

import java.io.File;
import java.io.IOException;

public class MainRunDecorator {
    public static void main(String[] args) throws IOException, CryptoException {
        String fileName = "src/main/java/kz/narxoz/patterns/decorator/resultFile";

        DataSource source = new FileDataSource(fileName);
        boolean isEnabledEncryption = true;
        boolean isEnabledCompression = true;

        if(isEnabledEncryption){
            source = new EncryptionDecorator(source);
        }
        if(isEnabledCompression){
            source = new CompressionDecorator(source);
        }

        String inputFileName = "src/main/java/kz/narxoz/patterns/decorator/myFile";
        File inputFile = new File(inputFileName);
        source.writeData(String.valueOf(inputFile));



    }
}
