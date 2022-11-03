package java_notes_practice;

class Dog1{
    public Dog1(int size, String name) {
        this.size = size;
        this.name = name;
    }

    int size;
    String name;

    void bark(){
        if(size >60){
            System.out.println("whoo whoo");

        } else if (size >40) {
            System.out.println("uuuuhhh uuhhh");
        }
        else{
            System.out.println("bhow Bhow");
        }

    }
}

public class TestDog {
    public static void main(String[] args){

        Dog1 d1 = new Dog1(20,"dog1");
        d1.bark();

        Dog1 d2 = new Dog1(50,"dog2");
        d2.bark();

    }
}
