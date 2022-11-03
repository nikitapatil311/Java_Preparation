package java_notes_practice;

public class Test1 {
    public static void main(String[] args){
        int x =3;
        if (x>2){
            System.out.print("a");
            System.out.print("-");
            x=x-1;
        }
        while(x>0){
            if (x==1){
                System.out.print("-d");
                x=x-1;
            }
            if(x==2){
                System.out.print("b c");
                x=x-1;
            }
        }
        //x=x-1;
        //System.out.println("-");
       /* while(x>0){
            if (x==1){
                System.out.println("d");
                x=x-1;
            }
            if(x==2){
                System.out.println("b c");
                x=x-1;
            }
        }*/

    }
}
