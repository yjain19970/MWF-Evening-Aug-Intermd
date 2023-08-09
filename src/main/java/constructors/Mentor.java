package constructors;

public class Mentor {
    String name;
    double avgRating;
    String emailID;
    boolean isInstructor;
    private int fees;
    //every constructor will set the values of attributes to DEFAULT.
    /**
     * OBSERVE:
     *
     * 1. Name of constructor is same that of class.
     * 2. Actually a method.
     * 3. NO return Type
     * 4. returns the instance of the class.
     * 5. Modifier not ALWAYS PUBLIC -- discuss.
     *
     */
    // custom constructor
    public Mentor(){

    }


    public Mentor(String inputName, String inputEmail){
        System.out.println("Name: " + name + " emailId: " + emailID);

        name  = inputName;
        emailID = inputEmail;
        System.out.println("AFTER SETTING VALUES....");
        System.out.println("Name: " + name + " emailId: " + emailID);
    }

    public Mentor(String instructorName, double avgRating, String emailID, boolean isInstructor, int fees){
        name = instructorName;
        avgRating = avgRating;
        emailID = emailID;
        isInstructor = isInstructor;
        fees =fees;
    }

}
