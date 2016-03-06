package ac.za.cput.mydavids;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static junit.framework.Assert.*;


/**
 * Created by Yusiry Davids on 3/6/2016.
 */
public class TestClass {

    MainClass mainClass = new MainClass();
    List list = new LinkedList();


    //TestMethods

    //Float
    @Test
    public void testPostiveFloat(){
        float x = 5;
        assertEquals(x, mainClass.returnFloat());
    }

    @Test
    public void testNegativeFloat(){
        int x = 5;
        assertEquals(x, mainClass.returnFloat());
    }

    //Object Equality
    @Test
    public void testPositiveObjectEquality(){
        assertEquals(mainClass, mainClass);
    }

    @Test
    public void testNegativeObjectEquality(){
        assertEquals(mainClass, mainClass.returnObject());
    }

    //Nullness
    @Test
    public void testPositiveNullness(){
        assertNull(mainClass.returnNull());
    }

    @Test
    public void testNegativeNullness(){
        assertNull(mainClass);
    }

    //Not Null
    @Test
    public void testPositiveNotNull(){
        assertNotNull(mainClass.returnNonNull());
    }

    @Test
    public void testNegativeNotNull(){
        assertNotNull(mainClass.returnNull());
    }

    //List
    @Test
    public void testPositiveList(){
        list.add(5);
        list.add(2);
        list.add(7);
        assertEquals(mainClass.returnList(), list);
    }

    @Test
    public void testNegativeList(){
        assertEquals(mainClass.returnList(), list);
    }


}
