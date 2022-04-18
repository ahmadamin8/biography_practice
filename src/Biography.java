import java.util.Scanner;
import java.util.ArrayList;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE

        Scanner userInput = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();


        System.out.println("What is your favorite author's first name?");
        String firstName = userInput.next();

        System.out.println("What is your favorite author's last name?");
        String lastName = userInput.next();

        System.out.println("Where is your favorite author from?");
        String country = userInput.next();

        System.out.println("Is your favorite author alive? (Y/N)");
        String alive = userInput.next();

        boolean isAlive = false;
        int age = 0;
        if (alive.toLowerCase().startsWith("y")) {
            isAlive = true;

            System.out.println("How old is your favorite author?");
            age = userInput.nextInt();

        }
        Author author = new Author(firstName, lastName, country, isAlive, age, bookList);


        String yesNo;
        do {
            System.out.println("Would you like to enter book information? (Y/N)");
            yesNo = userInput.next();

            if (yesNo.toLowerCase().startsWith("y")) {
                userInput.nextLine();
                System.out.println("What is the book name?");
                String name = userInput.nextLine();

                System.out.println("What is the genre of the book?");
                String genre = userInput.nextLine();

                System.out.println("How many pages does book have?");
                int totalPage = userInput.nextInt();

                Book allBooks = new Book(name, genre, totalPage);
                bookList.add(allBooks);
            }
        }

        while (yesNo.toLowerCase().startsWith("y"));

        System.out.println("Author's information = " + author);
        System.out.println("Author's books are as listed below: ");

        for (Book element : bookList) {
            System.out.println(element);

        }
    }
}











