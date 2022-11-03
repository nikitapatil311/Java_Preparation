class Movie{
    String title;
    int rating;

    public void playmovie(){
        System.out.println("playing movie");
    }

}


public class Testmoviedrive {
    public static void main(String[] args){
        Movie m1 = new Movie();
        m1.title = "Kantara";
        m1.rating = 5;
        m1.playmovie();

        Movie m2 = new Movie();
        m2.title = "gandadagudi";
        m2.rating = 5;
        m2.playmovie();


        System.out.println(m1.title);


        System.out.println(m2.title);


    }
}
