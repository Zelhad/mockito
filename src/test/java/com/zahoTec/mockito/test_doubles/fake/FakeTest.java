package com.zahoTec.mockito.test_doubles.fake;

import java.time.LocalDate;

public class FakeTest {
	@org.junit.jupiter.api.Test
	@org.junit.jupiter.api.Order(1)
	
	public  void testFake() {
		FakeBookRepository fakeBookRepository = new FakeBookRepository();
		BookService bookService= new BookService(fakeBookRepository);
		//int bookId, String title, Float price, LocalDate published
		bookService.addBook(new Book(1,"Mockito In Action", 51.30F, LocalDate.now()));
		bookService.addBook(new Book(2,"Mockito And Junit  In Action", 50.30F, LocalDate.now()));
		
		org.junit.jupiter.api.Assertions.assertEquals(2, bookService.findNumberBooks());
		
	}

	

}
