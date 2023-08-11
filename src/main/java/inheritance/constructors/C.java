package inheritance.constructors;

public class C  extends B{

    public C(){

    }

    public C(String x) {
        super(1);
        System.out.println(" Constructor of C: " + x);
    }

    public C(String x, String y) {
        super(1);
        System.out.println(" Constructor of C : " +x + " and " +y);
    }


}
