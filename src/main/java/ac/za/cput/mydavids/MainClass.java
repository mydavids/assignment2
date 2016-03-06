package ac.za.cput.mydavids;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yusiry Davids on 3/6/2016.
 */
public class MainClass {

    public float returnFloat(){
        return 5;
    }

    public static Object returnObject(){
        MainClass mainClass = new MainClass();
        return mainClass;
    }

    public static Object returnNonNull(){
        MainClass mainClass = new MainClass();
        return mainClass;
    }

    public static Object returnNull(){
        MainClass mainClass = null;
        return mainClass;
    }

    public static List returnList(){
        List list = new LinkedList();
        list.add(5);
        list.add(2);
        list.add(7);
        return list;
    }
}
