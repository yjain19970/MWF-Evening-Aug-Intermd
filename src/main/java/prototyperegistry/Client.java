package prototyperegistry;

public class Client {
    public static void main(String[] args) {
        StudentRegistry registry  = new StudentRegistry();
        fillRegistry(registry);

        Student copy = registry.get("wed_13_sept").clone();
        Student isCopy = registry.get("wed_13_sept_is").clone();

        System.out.println(copy);
        System.out.println(isCopy);

        EmployeeRegistery registery = new EmployeeRegistery();
        fillEmployeeRegistry(registery);

        Employee emp = registery.getByKey("newEmployee").clone();
        Employee emp2 = registery.getByKey("newIntelligent").clone();
    }

    private static void fillRegistry(StudentRegistry registry) {
        Student original  = new Student();
        original.setBatch("august");
        original.setAverageBatchPsp(70);

        /// filling the registy
        registry.register("wed_13_sept", original);

        IntelligentStudent is = new IntelligentStudent();
        is.setBatch("august");
        is.setAverageBatchPsp(70);

        registry.register("wed_13_sept_is", is);
    }

    private static void fillEmployeeRegistry (EmployeeRegistery registery) {
        Employee emp = new Employee();
        emp.setEmail("default@email.com");

        registery.register("newEmployee",emp);

        IntelligentEmployee iemp = new IntelligentEmployee();
        iemp.setEmail("intelligentemp@gmail.com");

        registery.register("newIntelligent", iemp);
    }
}

/*
 *  -----------------  Description  -------------------
 *  Prototype DP is when the object creation is costlier and requires lots of time and resources.
 *  Prototype DP provides a mechanism to copy the original object to a new object and save time and space.
 *  Registery DP used to save the copies of standard copies of a original object and uses regularly.
 *  The clone method is overridden to provide a deep copy of the object
 *  Scenario:
 *      - Classmate notebook
 *      - Mobile Phone making
 *      - Reusable Objects in multiple times
 *
 *  ----------------- Implementation -------------------
 *  Create a class
 *  Create setters and getters
 *  Create copy constructor and takes same class object
 *  Implement Cloneable Interface
 *  Implement clone() method and return new object
 *
 *  <Optional>
 *  Create a child class and extends Parent class
 *  Create a copy constructor and takes same class object
 *  Implement Cloneable Interface
 *  Implement clone() method and return new object
 *
 *  Create a Registery
 *  Create a Map <String, Object> using HashMap
 *  Create a register method
 *  Create a getMethod(String key) returns Object
 *
 */