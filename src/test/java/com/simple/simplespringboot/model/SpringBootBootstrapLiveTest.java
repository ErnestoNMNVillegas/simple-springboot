package com.simple.simplespringboot.model;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class SpringBootBootstrapLiveTest {
    private static final String API_ROOT
            = "http://localhost:8081/api/books";

    private Book createRandomBook() {
        Book book = new Book();
        book.setTitle(randomAlphabetic(10));
}
