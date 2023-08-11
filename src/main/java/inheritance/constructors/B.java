package inheritance.constructors;

public class B extends A {
    public B(){
        System.out.println(" Constructor of B");
    }

    public B(int x){
        System.out.println(" Constructor of B: " + x);
    }
}
