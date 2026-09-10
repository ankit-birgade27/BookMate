package com.bookmate.storage;

import java.util.ArrayList;
import java.util.List;

import com.bookmate.model.Book;

public class DataStore {
	
	private static List<Book> books = new ArrayList<>();
	
	public static List<Book> getBooks(){
		return books;
	}

}
