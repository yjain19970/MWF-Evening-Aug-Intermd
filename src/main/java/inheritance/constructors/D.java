package inheritance.constructors;

public class D extends C{
    public D(String x) {
       super(x); // it will call parent constructor with given arguments.
        // should always be 1st line in your child constructor.
        System.out.println(" Constructor of D");
    } // ctrl+N


}
