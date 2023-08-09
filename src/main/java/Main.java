public class Main {


    public static void main(String[] args) {

        Student ashim = new Student();
        Student sridhar = new Student();

        ashim.age= 20;
        ashim.name = "Ashim";
        ashim.email = "coolashim@gmail.com";
        ashim.height  = 180.1;
        ashim.attendContest();
        ashim.changeBatch();

        sridhar.age= 30;
        sridhar.name = "Sridhar";
        sridhar.email = "coolsridhar@gmail.com";
        sridhar.height  = 160.1;
        sridhar.attendContest();
        sridhar.changeBatch();

        System.out.println(ashim.name);
        System.out.println(sridhar.email);


    }
}
