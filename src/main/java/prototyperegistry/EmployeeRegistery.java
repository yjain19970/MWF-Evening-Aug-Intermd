package prototyperegistry;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRegistery {
    Map<String, Employee> map = new HashMap<>();

    //register
    public void register (String key, Employee emp){
        map.put(key, emp);
    }
    //get by key
    public Employee getByKey(String key){
        return map.get(key);
    }
}


/*
 *  Create a Registery
 *  Create a Map <String, Object>
 *  Create a register method
 *  Create a getMethod( String key ) returns Object
 */