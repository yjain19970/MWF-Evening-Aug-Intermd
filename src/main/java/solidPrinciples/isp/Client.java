package solidPrinciples.isp;

public class Client {
    public static void main(String[] args) {

    }
}

/*
 *  The abstract methods of a super class all should implement in child class even child class doesn't need all the methods
 *  We can't keep the empty blocks for making the class concrete or returns a dummy value.
 *
 *  The Interface Segregation Principle states that clients should not be forced to implement interfaces they don't use.
 *  ISP splits interfaces that are very large into smaller and more specific ones so that clients will only have to know
 *  about the methods that are of interest to them.
 *
 *  https://www.javaguides.net/2018/02/interface-segregation-principle.html
 *
 */
