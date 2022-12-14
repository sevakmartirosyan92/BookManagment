package storage;

import model.Author;
import model.Book;

public class BookStorage {
    private Book[] array = new Book[10];
    private int size = 0;


    public void add(Book book) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = book;
    }

    private void increaseArray() {
        Book[] temp = new Book[array.length + 10];
        System.arraycopy(array, 0, temp, 0, size);
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");

        }
    }

    public void printBooksByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthor().equals(author)) {
                System.out.println(array[i]);
            }
        }
    }


    public void printBooksByGenre(String genre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().contains(genre))
                System.out.println(array[i]);

        }
    }

    public void printBooksByPriceRange(int min, int max) {
        for (int i = 0; i < size; i++) {
            Book book = array[i];
            if (book.getPrice() >= min && book.getPrice() <= max) {
                System.out.println(book);
            }


        }
    }

    public void printBooksByAuthorName(String name) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthor().equals(name)) {
                System.out.println(array[i]);
            }
        }
    }
}