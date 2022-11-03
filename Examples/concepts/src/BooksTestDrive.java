

class Books{
    String title;
    String author;
}



public class BooksTestDrive {
    public static void main(String[] args) {

        int x = 0;
        Books[] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "java book";
        myBooks[1].title = "Java is awesome";
        myBooks[2].title = "Read JAVA";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Jhon";
        myBooks[2].author = "Nikita";

        while(x < myBooks.length){
            System.out.println("myBooks[x].title");
            System.out.println("By");
            System.out.println("myBooks[x].author");
            x++;

        }


    }


}
