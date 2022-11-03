
class employee
{
    int id;
    String name;


    employee(int id, String name)
    {
        System.out.println("constructor");
        this.id = id;
        this.name = name;
    }




    public void new_intro()
    {
        System.out.println(this.id);
        System.out.println(this.name);

    }



}


public class TemplateOops

{ public static void main (String[] args)
{ employee e1 = new employee(20,"harish");
    employee e2 = new employee(30,"Abhishek");

    e1.new_intro();
    e2.new_intro();


}

}
