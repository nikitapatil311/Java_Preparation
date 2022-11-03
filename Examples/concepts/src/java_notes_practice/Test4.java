package java_notes_practice;

public class Test4 {
    public static void main(String[] args) {

        int x=0, y=0;
        while(x<5){


          if(y<5){
              x=x+1;
              if(y<3){
                  x=x-1;
              }
          }
          y=y+2;

            System.out.println( x+""+y+"");



            //System.out.println("x=" +x+"y="+y);
            x=x+1;
        }

    }
}
