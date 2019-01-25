package com.degin.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class BookList {
    private List<Book> bookList;
    private int index;

    public BookList() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public  Iterator iterator(){
        return new itr();
    }

    private class  itr implements Iterator{

        @Override
        public boolean hasNext() {
            if(index>=bookList.size()){
                return  false;
            }
            return true;
        }

        @Override
        public Object next() {
            return bookList.get(index++);
        }

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer action) {

        }
    }

}
