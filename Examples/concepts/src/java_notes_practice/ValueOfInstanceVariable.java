package java_notes_practice;

class Paper{
    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}


public class ValueOfInstanceVariable {
    public static void main(String[] args){
        Paper P1 = new Paper();
        System.out.println(P1.getSize()+""+P1.getName());

    }
}
