package prototyperegistry;

public class IntelligentEmployee extends Employee implements  Cloneable{

    int empIQ;

    public IntelligentEmployee (){

    }

    public IntelligentEmployee (IntelligentEmployee i){
        super(i);
        this.empIQ = i.empIQ;;
    }

    @Override
    public IntelligentEmployee clone() {
        return new IntelligentEmployee(this);
    }
}

/*
 *  Create a child class and extends Parent class
 *  Create a copy constructor
 *  Implement Cloneable Interface
 *  Implement clone method and return new object
 */