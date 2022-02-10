package com.coreJava;
import java.io.Serializable;

public class LibManagementSystem {
    public static class Book implements Serializable{

        public int book_no;
        protected String title;
        private final String author;
        protected double price;

        public Book() {
            book_no = 0;
            title = null;
            author = null;
            price = 0;
        }

        public Book(int book_number, String title, String author, double price){
            this.book_no = book_number;
            this.title = title;
            this.author = author;
            this.price = price;
        }
        public String toString() {
            return "\n TITTLE:" + title + "\n AUTHOR :" + author +
                    "\n B_NUMBER" + book_no + "\n PRICE" + price + "\n";
        }
    }

    interface libraryFac {
        public void test();
    }
    static class library implements libraryFac {
        public void test() {
            System.out.println("Interface implemented successfully ");
        }

        public static void main(String[] args) {
            library lib = new library();
            lib.test();
        }
    }
    abstract static class price {
        int p = 0;
        abstract public void calculatedPrice();
    }
    public static class account extends price {
        public static void main(String[] args) {
            account acc = new account();
            acc.p = 250;
            acc.calculatedPrice();
        }
        public void calculatedPrice() {
            System.out.println("Max Retail Price = " +p);
        }

    }
}