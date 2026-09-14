 package com.bookmate.storage;

import java.util.ArrayList;
import java.util.List;

import com.bookmate.model.Author;
import com.bookmate.model.Book;
import com.bookmate.model.Category;
import com.bookmate.model.IssueRecord;

public class DataStore {
	
	private static List<Book> books = new ArrayList<>();
	
	private static List<Author> authors = new ArrayList<>();
	
	private static List<Category> categories = new ArrayList<>();
	
	private static List<IssueRecord> issues = new ArrayList<>();
	
	public static List<Author> getAuthors(){
		return authors;
	}
	
	public static List<Category> getCategories(){
		return categories;
	}
	
	public static List<Book> getBooks(){
		return books;
	}
	
	public static List<IssueRecord> getIssues(){
		return issues;
	}

}
