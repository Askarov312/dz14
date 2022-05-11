public class Main {
    public static void main(String[] args) {


         Person person = new Person();
         person.setName("Maksat");
         person.setDesignation("Aziza");
         person.eat();
         person.walk();
         person.learn();
        System.out.println(person);

        System.out.println();

        Programmer programmer = new Programmer();
        programmer.setCompanyName("Andrei");
        programmer.setName("Nurs");
        programmer.setDesignation("Aibek");
        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.coding();
        System.out.println(programmer);


}}
