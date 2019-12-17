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
public interface FileUtils {
    void toUtf8(ValidCharset charset, String from, String to) throws InvalidSourceException;
}
