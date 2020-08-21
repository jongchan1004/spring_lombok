package com.java_config.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Object o1 = context.getBean("book");
		Book book = (Book) o1;
		System.out.println("o1: "+o1);
		System.out.println("book: "+book);
		
		System.out.println();
		
		Object o2 = context.getBean("bookStore");
		BookStore bookStore = (BookStore) o2;
		BookStore bs2 = context.getBean("bookStore", BookStore.class); //casting까지 한 꺼번에
		System.out.println("o2: "+o2);
		System.out.println("bookStore: "+bookStore);
		System.out.println("bookStore: "+bs2);
		
		System.out.println();
		
		System.out.println("bookStore.getBook(): "+bookStore.getBook());
		
		System.out.println();
		
		System.out.println("o2==bs2 : "+(o2==bs2)); //bean은 특별한 설정을 하지 않는 이상 singletone 객체임
		System.out.println("bookStore.getBook()==o1 : "+(bookStore.getBook()==o1));
		
		System.out.println();
		
		System.out.println("done");
		
		((AnnotationConfigApplicationContext) context).close();
	}
}
