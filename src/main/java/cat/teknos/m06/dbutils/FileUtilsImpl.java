/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.teknos.m06.dbutils;

import java.io.*;

/**
 *
 * @author 10010678
 */
public class FileUtilsImpl implements FileUtils {

    @Override
    public void toUtf8(ValidCharset charset, String from, String to) {
        var fileFrom = new File(from);

        //To Do: tests
        try (var inputStream = new LogFileInputStream(new BufferedInputStream(new FileInputStream(fileFrom)))) {
            int character;
            while ((character = inputStream.read()) < 0) {
                //To Do : Write with utf8 charset
                if (inputStream.available() < 10){
                    
                }
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }

    }

}
