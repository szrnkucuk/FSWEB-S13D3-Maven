package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    int phoneNumber;
    String email;
    int numOfStudent;

    public Person(String firstName, String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;

    }

    public Person(String firstName, String lastName,int age, int phoneNumber, String email, int numOfStudent){
        this(firstName,lastName,age);
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.numOfStudent=numOfStudent;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean isTeen() {
        return this.age >= 13 && this.age < 19;
    }

}
