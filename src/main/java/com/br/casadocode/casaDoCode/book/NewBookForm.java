package com.br.casadocode.casaDoCode.book;

import com.br.casadocode.casaDoCode.author.Author;
import com.br.casadocode.casaDoCode.enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewBookForm {

    @NotBlank
    private String name;

    @NotBlank
    private String code;

    private Genre genre;

    private boolean hardCover;

    private boolean onSale;

    private int pages;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Author author;

    public Book toEntity() {
        return new Book(name, code, genre, hardCover, onSale, pages, author);
    }
}
