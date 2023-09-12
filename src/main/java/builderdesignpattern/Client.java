package builderdesignpattern;

public class Client {
    public static void main(String[] args) throws Exception {

        //Helper h = new Helper("Yash", "yash@gmail.com", 110, "70105293442", 10.2);

//        Student.StudentBuilder h  = Student.getBuilder();
//        h.setName("sds");
//        h.setName("dsds");

        Student s = Student.getBuilder()
                .setName("Yash")
                .setAge(10)
                .setEmail("yash@gmail.com").setNestedStudent(new NestedStudent()).build();








    }
}
