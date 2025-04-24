package org.example;



public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Ali", "Kucuk", 21,532,"xx@hotmail.com",32);
        System.out.println("Firstname: " + person1.getFirstName());

        System.out.println("LastName: " + person1.getLastName());

        System.out.println("PhoneNumber: " + person2.getPhoneNumber());

        System.out.println("*****SECOND PART******");

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}
