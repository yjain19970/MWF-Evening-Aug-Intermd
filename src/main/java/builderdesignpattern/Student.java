package builderdesignpattern;

public class Student {
    String name;
    String email;
    int age;
    String phoneNo;
    double psp;

    public Student(Helper h) throws Exception {
        if(h.getAge() > 100){
            throw new Exception("Age should be less than 100");
        }
        if(h.getPsp() <0){
            throw new Exception("PSP should be > than 0");
        }

        this.age = h.getAge();
        this.email = h.getEmail();
        this.phoneNo = h.getPhoneNo();
        this.name = h.getName();
        this.psp = h.getPsp();
    }

}
