/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.teknos.m06.dbutils;

import cat.teknos.m06.dbutils.Exceptions.InvalidSourceException;
import java.io.File;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests to do:
 * From is null // From not exists
 * To is null // To not exists
 * Happy Path (All works fine)
 */

/**
 *
 * @author 10010678
 */
public class FileUtilsImplTest {
    private static final FileUtils fileUtils = new FileUtilsImpl();
    private static final String to = "src/main/Resources/FileTo.txt";
    private static final String fromAscii = "src/main/Resources/ascii.txt";
    private static final String fromUtf8 = "src/main/Resources/utf8.txt";
    private static final String fromIso8859 = "src/main/Resources/iso8859.txt";
    private static final String fromEmptyFile = "src/main/Resources/FromEmpty.txt";
    private static final String fromNotExisting = "src/main/Resources/fromNotExisting.txt";
    private static final String fromEmptyPath = " ";
    @Test
    public void GivenFromNull_WhenToUtf8_ThenInvalidSourceException() {
                
        Assertions.assertThrows(InvalidSourceException.class, () -> {
            fileUtils.toUtf8(ValidCharset.ASCII, null, to);
        });
    }
    
    @Test
    public void GivenToNull_WhenToUtf8_ThenInvalidSourceException() {
                
        Assertions.assertThrows(InvalidSourceException.class, () -> {
            fileUtils.toUtf8(ValidCharset.UTF8, fromUtf8, null);
        });
    }
    
    @Test
    public void GivenFromNotExisting_WhenToUtf8_ThenInvalidSourceException() {
        Assertions.assertThrows(InvalidSourceException.class, () -> {
           fileUtils.toUtf8(ValidCharset.UTF8, fromNotExisting, to); 
        });
    }

    @Test
    public void GivenFromEmptyFile_WhenToUtf8_ThenInvalidSourceException() {
        Assertions.assertThrows(InvalidSourceException.class, () -> {
            fileUtils.toUtf8(ValidCharset.UTF8, fromEmptyFile, to );
        });
    }
    
    @Test
    public void GivenFromEmptyPath_WhenToUtf8_ThenInvalidSourceException() {
        Assertions.assertThrows(InvalidSourceException.class, () -> {
           fileUtils.toUtf8(ValidCharset.UTF8, fromEmptyPath, to) ;
        });
    }
    
    @Test
    public void GivenValidForm_WhenToUtf8_ThenToCreated() throws InvalidSourceException {
            fileUtils.toUtf8(ValidCharset.UTF8, fromIso8859, to);
            var fileTo = new File(to);
            assertTrue(fileTo.exists());
            assertFalse(fileTo.length() == 0);
    }
}
