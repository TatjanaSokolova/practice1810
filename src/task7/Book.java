package task7;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book (String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book (String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }


    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(Double newPrice) {
        price = newPrice;
    }
    public int getQtyInStock() {
        return qtyInStock;
    }
    public void setQtyInStock(int newQtyInStock) {
        price = newQtyInStock;
    }

    public String getAuthorName() {
        return author.getName();
    }
    public String getAuthorEmail() {
        return author.getEmail();
    }
    public char getAuthorGender() {
        return author.getGender();
    }

    @Override
    public String toString() {
        return String.format("'%s' by %s", name, author);
    }
}