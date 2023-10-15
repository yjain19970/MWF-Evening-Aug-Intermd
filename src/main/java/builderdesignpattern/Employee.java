package builderdesignpattern;

public class Employee {
    private String name;
    private String email;
    private int age;
    private String phone;

    private Employee(){

    }

    private Employee(EmployeeBuilder eb){
        this.age = eb.age;
        this.name = eb.name;
        this.email = eb.email;
        this.phone = eb.phone;
    }

    public static EmployeeBuilder getBuilder(){
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder{
        private String name;
        private String email;
        private int age;
        private String phone;

        public EmployeeBuilder(){

        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public int getAge() {
            return age;
        }

        public String getPhone() {
            return phone;
        }

        public EmployeeBuilder setName(String name){
            this.name = name;
            return this;
        }

        public EmployeeBuilder setEmail(String email){
            this.email = email;
            return this;
        }

        public EmployeeBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public EmployeeBuilder setPhone(String phone){
            this.phone = phone;
            return this;
        }

        private EmployeeBuilder validObject() throws Exception {
            if(this.age < 18){
                throw new Exception("age is not supported");
            }

            if(this.phone.length() != 10){
                throw new Exception("phone is not valid");
            }

            return this;
        }

        public Employee build() throws Exception {
            validObject();
            return new Employee(this);
        }
    }
}
