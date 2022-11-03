class Bike{
    private int bike_no;
    private String bike_name;

    public int getBike_no() {
        return bike_no;
    }

    public void setBike_no(int bike_no) {
        this.bike_no = bike_no;
    }

    public String getBike_name() {
        return bike_name;
    }

    public void setBike_name(String bike_name) {
        this.bike_name = bike_name;
    }

    public Bike(int bike_no, String bike_name) {
        this.bike_no = bike_no;
        this.bike_name = bike_name;
    }
}

class Person{
    public Person(int id_no, String name, Bike bike_name) {
        this.id_no = id_no;
        this.name = name;
        this.bike_name = bike_name;
    }

   private int id_no;
    private Bike bike_name;
    String name;

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }

    public Bike getBike_name() {
        return bike_name;
    }

    public void setBike_name(Bike bike_name) {
        this.bike_name = bike_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class CompositionBike {
    public static void main(String[] args){

        Bike mybike = new Bike(99, "duke");
        System.out.println(mybike.getBike_name());

        Person p1 = new Person(22,"tina",mybike);
        System.out.println(p1.getId_no() +""+""+p1.getName());

    }
}
