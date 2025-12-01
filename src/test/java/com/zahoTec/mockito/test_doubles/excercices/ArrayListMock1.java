package com.zahoTec.mockito.test_doubles.excercices;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.jupiter.api.Order;

public class ArrayListMock1 {

	@org.junit.jupiter.api.Test
	@Order(1)
	void testArrayList() {
		@SuppressWarnings("unchecked")
	ArrayList<String> mockedArrayList = mock(ArrayList.class);
		mockedArrayList.add("hello");
		 verify(mockedArrayList).add("hello");
	}
	@org.junit.jupiter.api.Test
	@Order(2)
	void testStub() {
		@SuppressWarnings("unchecked")
		java.util.List<String> mockedList = mock(java.util.List.class);
		org.mockito.Mockito.when(mockedList.get(0)).thenReturn("apple");
		org.junit.Assert.assertEquals("apple",mockedList.get(0));
	}
	@org.junit.jupiter.api.Test
	@Order(3)
	void testWithArgumentMatcher() {
	    @SuppressWarnings("unchecked")
	    java.util.List<String> mockedListString = mock(java.util.List.class);

	    when(mockedListString.get(anyInt())).thenReturn("banana");

	    // Assertions
	    assertEquals("banana", mockedListString.get(0));
	    assertEquals("banana", mockedListString.get(999));
	}
	
	@org.junit.jupiter.api.Test
	@Order(4)
	void testNumberInvocation() {
	    @SuppressWarnings("unchecked")
	    java.util.List<String> listMockedNumberInvocation = mock(java.util.List.class);

	    listMockedNumberInvocation.add("orange");
	    listMockedNumberInvocation.add("orange");
	    listMockedNumberInvocation.add("orange");
	    // Verify add("orange") was called exactly 3 times
	    verify(listMockedNumberInvocation, times(3)).add("orange");
	}
	
	@org.junit.jupiter.api.Test
	@Order(5)
	public void testLinkedList() {
		@SuppressWarnings("unchecked")
		java.util.LinkedList<String> mockedList = mock(LinkedList.class);
		//Stubbing
		when(mockedList.get(0)).thenReturn("first");
		when(mockedList.get(1)).thenThrow(new RuntimeException());
		System.out.println(mockedList.get(0));
		System.out.println(mockedList.get(1));
		System.out.println(mockedList.get(999));
		verify(mockedList.get(0));
		
	}


	
}
