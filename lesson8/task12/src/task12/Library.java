package task12;

public class Library {
    String name;
    String city;
    Book[] books = new Book[100];
    int sizeOfBooks = 0;
    private Library(){}

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getSizeOfBooks() {
        return sizeOfBooks;
    }

    public void setSizeOfBooks(int sizeOfBooks) {
        this.sizeOfBooks = sizeOfBooks;
    }

    public int sizeBooks(){
        return sizeOfBooks;
    }

    public int priceSum(){
        int summa=0;
        for (int i=0; i<sizeOfBooks; i++){
            summa+=books[i].price;
        }
        return summa;
    }

    public Book getBook(int index){
        return books[index];
    }

    public void addBook(Book book){
        books[sizeOfBooks]=book;
        sizeOfBooks++;
    }

}
