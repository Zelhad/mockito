package com.zahoTec.mockito.test_doubles.fake;

import java.util.Collection;

public class FakeBookRepository implements BookRepository {

	//Fake  database in  memory  database 
	java.util.HashMap<Integer, Book> bookStores = new java.util.HashMap<>();
	
	@Override
	public void save(Book book) {
		bookStores.put(book.getBookId(), book);
		
	}

	@Override
	public Collection<Book> findAll() {
		return bookStores.values();
	}

}
