package cat.teknos.m06.dbutils;

import cat.teknos.m06.dbutils.Exceptions.DbUtilsException;
import cat.teknos.m06.dbutils.Exceptions.InvalidSourceException;

public interface SchemaLoader {
    /***
     * loads a db scema from a provided sql file
     * 
     * @param path to an sq file
     * @throws InvalidSourceException if te file doesn't exist
     *         or is a folder 
     * @throws DbUtilsException if path is null, empty 
     *         or file name doesn't end with .sql
     */
    void Load(String path) throws InvalidSourceException, DbUtilsException;
}
