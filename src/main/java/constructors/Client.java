package constructors;

public class Client {

    public static void main(String[] args) {

        Mentor  m = new Mentor(); // this is called as default constructor

//        System.out.println(m.name);
//        System.out.println(m.avgRating);
//        System.out.println(m.emailID);
//        System.out.println(m.isInstructor);
        m.name= " ";
        m.avgRating = 5.2;

        Mentor m2 = new Mentor("Yash", "yash.jain_1@scaler.com");




        Mentor m3 = new Mentor("Yash", 4.3, "abc@gmail.com", false,10000);





        // private
       // Instructor i = new Instructor();


    }
}
