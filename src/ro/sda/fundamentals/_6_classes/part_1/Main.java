package ro.sda.fundamentals._6_classes.part_1;

public class Main {
    public static void main(String[] args) {

        //it calls the default constructor and it creates an object/instance
        Person p1 = new Person();

//        p1.firstName = "Harry";
//        p1.lastName = "Potter";
//        p1.age = 30;

        p1.setFirstName("Harry");
        p1.setLastName("Potter");
        p1.setAge(30);

        Person p2 = new Person();

//        p2.firstName = "Leo";
//        p2.lastName = "Messi";
//        p2.age = 35;

        p2.setFirstName("Leo");
        p2.setLastName("Messi");
        p2.setAge(35);

        System.out.println(p1.getFirstName() + " " + p1.getLastName() + " " + p1.getAge());
        System.out.println("--------------------------------");


        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
