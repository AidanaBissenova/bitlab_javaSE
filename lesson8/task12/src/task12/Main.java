package task12;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book[] books = new Book[100];
        books[0] = new Book("This or that", "Chan", 2, 10);
        books[1] = new Book("Me", "Aidana", 23, 20);
        books[2] = new Book("2This or that", "2Chan", 22, 30);
        books[3] = new Book("2Me", "2Aidana", 223, 40);
        books[4] = new Book("3This or that", "3Chan", 32, 50);
        books[5] = new Book("3Me", "3Aidana", 323, 60);
        books[6] = new Book("4This or that", "4Chan", 42, 100);
        books[7] = new Book("4Me", "4Aidana", 423, 20);
        books[8] = new Book("5This or that", "5Chan", 52, 30);
        books[9] = new Book("6Me", "6Aidana", 623, 40);
        Library[] libraries = new Library[2];
        libraries[0] = new Library("Ast", "Assataan");
        libraries[1] = new Library("Almaty", "Ata");
        libraries[0].addBook(books[0]);
        libraries[0].addBook(books[1]);
        libraries[0].addBook(books[2]);
        libraries[0].addBook(books[3]);
        libraries[1].addBook(books[4]);
        libraries[1].addBook(books[5]);
        libraries[1].addBook(books[6]);
        libraries[1].addBook(books[7]);
        libraries[1].addBook(books[8]);
        libraries[1].addBook(books[9]);
        System.out.println(libraries[0].priceSum()+" "+
        libraries[0].sizeBooks()+ " "+
        libraries[0].getBook(0));
        System.out.println(libraries[1].priceSum()+" "+
                libraries[1].sizeBooks()+ " "+
                libraries[1].getBook(0));
    }

}
