package com.degin.pattern.iterator;

import java.util.Iterator;

/**
 * @Description 迭代器模式
 **/
public class test {
    public static void main(String[] args){
        BookList bookList=new BookList();
        Book book1=new Book("a");
        Book book2=new Book("b");

        bookList.addBook(book1);
        bookList.addBook(book2);

        Iterator itr=bookList.iterator();

        while (itr.hasNext()){
            Book book= (Book) itr.next();
            System.out.println(book.getName());
        }

    }
}
