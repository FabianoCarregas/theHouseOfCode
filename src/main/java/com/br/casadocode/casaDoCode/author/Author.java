package com.br.casadocode.casaDoCode.author;

import com.br.casadocode.casaDoCode.book.Book;
import com.br.casadocode.casaDoCode.enums.Country;
import com.br.casadocode.casaDoCode.enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String description;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Enumerated(EnumType.STRING)
    private Country country;

    @OneToMany
    private List<Book> books;

    public Author(String name, String email, String description, Genre genre, Country country) {
        this.name = name;
        this.email = email;
        this.description = description;
        this.genre = genre;
        this.country = country;
    }
}
