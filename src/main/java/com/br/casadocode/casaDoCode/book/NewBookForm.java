package com.br.casadocode.casaDoCode.book;

import com.br.casadocode.casaDoCode.author.Author;
import com.br.casadocode.casaDoCode.enums.Genre;

import javax.persistence.ManyToOne;

public class NewBookForm {
    private String name;
    private String code;
    private Genre genre;
    private boolean hardcover;
    private boolean onSale;
    private int pages;
    @ManyToOne
    private Author author;

    public Book toEntity() {
        return new Book(name, code, genre, hardcover, onSale, pages, author);
    }
}
