package cat.teknos.m06.dbutils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 10010678
 */
public class SchemaLoaderImplTest {
    
    private static final String Path = "src/test/resources/Dbutils.sql";
    
    public SchemaLoaderImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Load method, of class SchemaLoaderImpl.
     */
    @Test
    public void testLoad() throws Exception {
        System.out.println("Load");
        String path = "";
        SchemaLoaderImpl instance = new SchemaLoaderImpl();
        instance.Load(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
