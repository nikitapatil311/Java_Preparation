
class Dog{
    int size;
    String breed ;

    public void bark(){
        System.out.println("bow bow");
    }
}

public class Testdog {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.size = 40;
        d1.breed = "rottweiler";

        d1.bark();


    }
}
