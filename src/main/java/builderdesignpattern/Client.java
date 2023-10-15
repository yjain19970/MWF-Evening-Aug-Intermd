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
        Student s2 = new Student.StudentBuilder().setName("sridhar").setEmail("Sridhar@email.com").build();
        System.out.println(s2.name);

        Employee employee = Employee.getBuilder().setName("Sridhar")
                                        .setAge(30)
                                        .setEmail("Sridhar@email.com")
                                        .setPhone("9343483743")
                                        .build();
        Employee employee2 = Employee.getBuilder().setName("sridhar")
                    .setAge(20)
                    .setPhone("9376473222")
                    .setEmail("sridhar123@gmail.com")
                    .build();
        System.out.println(employee);
        System.out.println(employee2);
    }
}

/*
 *  On what cases we can use Builder Design Pattern:
 *  1. when having many attributes
 *  2. if you want to create an object after validation.
 *  3. Creating object with optional parameters and when requires @Override constructors.
 *  4. When creating many override constructors using parameters will lead to conflicts.
 *          - lot of values : conflicts with same type of params
 *          - Code not readable
 *          - if new attribute is added / deleted
 *          - Lead to too many constructors
 *          - Constructor with same signature cannot exist.
 *  5. Passing many nulls value in constructor is bad practice.
 *  6. Called Telescoping constructors.
 *  7. Avoids Code duplication.
 *
 * Solution for this :
 *  -> Create Builder class
 *       - add same attributes
 *       - setter methods returns builder object
 *       - create a validation method
 *       - valid method returns Builder parent constructor
 *  This will solve passing many attributes.
 *
 */
