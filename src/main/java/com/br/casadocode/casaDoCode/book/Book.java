package com.br.casadocode.casaDoCode.book;

import com.br.casadocode.casaDoCode.author.Author;
import com.br.casadocode.casaDoCode.enums.Genre;
import com.br.casadocode.casaDoCode.record.Recording;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String code;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private boolean hardCover = false;

    private boolean onSale = false;

    private int pages;

    @ManyToOne
    private Author author;

    @ManyToOne
    private Recording record;


    public Book(String name, String code, Genre genre, boolean hardCover, boolean onSale, int pages, Author author) {
        this.name = name;
        this.code = code;
        this.genre = genre;
        this.hardCover = hardCover;
        this.onSale = onSale;
        this.pages = pages;
        this.author = author;
    }
}
