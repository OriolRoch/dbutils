/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.teknos.m06.dbutils;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author 10010678
 */
public class LogFileInputStream extends InputStream {

    private final InputStream inputStream;

    public LogFileInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public int read() throws IOException {
        System.out.println("Reading...");
        return inputStream.read();
    }

}
