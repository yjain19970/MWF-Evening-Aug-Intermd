package prototyperegistry;

public class Employee implements Cloneable {
    private String name;
    private String email;
    private int age;

    public Employee(){}

    public Employee (Employee e){
        this.name = e.name;
        this.email = e.email;
        this.age = e.age;
    }

    @Override
    public Employee clone() {
        return new Employee(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


/*
 *  Create a class
 *  Create setters and getters
 *  Create copy constructor
 *  Implement Cloneable Interface
 *  Implement clone() method return new object
 */