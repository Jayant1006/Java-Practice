public class Book {
    private String book_name;
    private String author;
    private double price;
    private int qty;

    public Book(String book_name, String author, double price, int qty) {
        this.book_name = book_name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getBookName() {
        return book_name;
    }

    public String getAuthorName() {
        return author;
    }

    public double bookPrice() {
        return price;
    }

    public int bookQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Overridding the toStirng method;
    public String toString() {
        return "'" + book_name + "' by " + author;
    }

    public static void main(String args[]) {
        Book b1 = new Book("Steve Jobs", "xyz", 2.5, 6);
        System.out.println(b1);
    }
}
