/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * This project is in GITHUB
 */
package cat.teknos.m06.dbutils;

import cat.teknos.m06.dbutils.Exceptions.DbUtilsException;
import cat.teknos.m06.dbutils.Exceptions.InvalidSourceException;
import static cat.teknos.m06.dbutils.ValidCharset.ASCII;
import java.io.*;
import java.nio.charset.Charset;

/**
 *
 * @author 10010678
 */
public class FileUtilsImpl implements FileUtils {

    @Override
    public void toUtf8(ValidCharset ValidCharset, String from, String to) throws InvalidSourceException {
        //Befor calling from and to, test if from and to are null
        if (from == null || to == null){
            throw new InvalidSourceException("null");
        }else if(from.isEmpty()){
            throw new InvalidSourceException("empty path");
        }
        else{
            var fileFrom = new File(from);
            if (fileFrom.length() == 0){
                throw new InvalidSourceException("empty file");
            }
            var charset = getCharset(ValidCharset);
            var fileTo = new File(to);

            //To Do: tests
            try (var reader = new BufferedReader(new FileReader(fileFrom, charset))) {
                String line;
                try (var writer = new BufferedWriter((new FileWriter(to, charset)))) {
                    while((line = reader.readLine()) != null){
                        writer.write(line);
                    }
                } catch (IOException e) {
                    throw new DbUtilsException(e);
                }

            } catch (FileNotFoundException e) {
                throw new InvalidSourceException(e);
            } catch (IOException e) {
                throw new DbUtilsException(e);
            }
        }

    }
    private static Charset getCharset(ValidCharset validCharset) {
        Charset charset;
        switch(validCharset){
            case ASCII:
                charset = Charset.forName("US-ASCII");
                break;
            case ISO8859:
                charset = Charset.forName("ISO-8859-1");
                break;
            case UTF8:
                charset = Charset.forName("UTF8");
                break;
            default:
                charset = Charset.forName("UTF16");
                break;
        }
        return charset;
    }
    
    public boolean isNull(String from, String to){
        if (from == null || to == null){
            return true;
        }
        else{
            return false;
        }
    }

}
