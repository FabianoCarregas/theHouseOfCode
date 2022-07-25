package com.br.casadocode.casaDoCode.author;

import com.br.casadocode.casaDoCode.book.Book;
import com.br.casadocode.casaDoCode.enun.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

import static javax.persistence.EnumType.STRING;

@Getter
@AllArgsConstructor
public class NewAuthorForm {

    @NotBlank
    private String name;

    @NotBlank
    private String email;

    @NotBlank
    private String description;

    @CreationTimestamp
    private LocalDateTime date;

    @Enumerated(STRING)
    private Genre genre;

    @NotBlank
    private String nationality;
    private boolean alive;

    private Book book;

    public Author toEntity() {
        return new Author(
                null,
                this.name,
                this.email,
                this.description,
                LocalDateTime.now(),
                this.genre,
                this.nationality,
                this.alive, null);
    }
}
