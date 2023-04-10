package chapter11;

public class Costumer {
    public static void main(String[] args) {

        Product book = new Book();
        book.setPrice(9.99);
        System.out.println("Book price: $" + book.getPrice());
    }
}
