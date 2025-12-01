package com.zahoTec.mockito.test_doubles.fake;

public interface BookRepository {
	void save(Book book);
	java.util.Collection<Book> findAll();

}
