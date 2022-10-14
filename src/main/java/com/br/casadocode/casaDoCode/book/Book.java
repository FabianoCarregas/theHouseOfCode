package com.br.casadocode.casaDoCode.book;

import com.br.casadocode.casaDoCode.author.Author;
import com.br.casadocode.casaDoCode.enums.Genre;
import com.br.casadocode.casaDoCode.record.Recording;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String code;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private boolean hardcover;

    private boolean onSale;

    private int pages;

    @ManyToOne
    private Author author;

    @ManyToOne
    private Recording record;


    public Book(String name, String code, Genre genre, boolean hardcover, boolean onSale, int pages, Author author) {
        this.name = name;
        this.code = code;
        this.genre = genre;
        this.hardcover = hardcover;
        this.onSale = onSale;
        this.pages = pages;
        this.author = author;
    }
}
