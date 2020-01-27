/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.teknos.m06.dbutils;

import cat.teknos.m06.dbutils.Exceptions.InvalidSourceException;

/**
 *
 * @author 10010678
 */
public class Program {
    public static void main(String[] args) throws InvalidSourceException {
        new FileUtilsImpl().toUtf8(ValidCharset.UTF8, "src/main/resources/ascii.txt", "src/main/resources/FileTo.txt");
    }
}
