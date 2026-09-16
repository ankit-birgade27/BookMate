 package com.bookmate.storage;

import java.util.ArrayList;
import java.util.List;

import com.bookmate.model.Author;
import com.bookmate.model.Book;
import com.bookmate.model.BookCopy;
import com.bookmate.model.Category;
import com.bookmate.model.IssueRecord;
import com.bookmate.model.Member;

public class DataStore {
	
	private static final List<Book> books = new ArrayList<>();
	
	private static final List<Author> authors = new ArrayList<>();
	
	private static final List<Category> categories = new ArrayList<>();
	
	private static final List<IssueRecord> issues = new ArrayList<>();
	
	private static final List<Member> members=new ArrayList<> ();
	
	private static final List<BookCopy> copies = new ArrayList<>();
	
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
	
	public static List<Member> getMembers(){
		return members;
	}
	
	public static List<BookCopy> getcopies(){
		return copies ;
	}

}
