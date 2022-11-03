package java_notes_practice;
// Array is used to store homogenous time of data
//Array itself is an object

class Dog{
    String name;
    int pets;
}

public class Array {
    public static void main(String[] args){
        Dog d1 = new Dog();


        d1.name = "rottweiler";
        System.out.println(d1.name);

        Dog[] pets = new Dog[6];
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        Dog d4 = new Dog();
        Dog d5 = new Dog();

        System.out.println(pets[5]);
        d3.name = "german shepherd";
        d4.name = "Mark";
        pets[3] = new Dog();
        pets[3].name = "Lilly";

        System.out.println(pets[3].name);


    }


}
