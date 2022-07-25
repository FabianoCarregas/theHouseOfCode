package com.br.casadocode.casaDoCode.author;


import com.br.casadocode.casaDoCode.book.Book;
import com.br.casadocode.casaDoCode.enun.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

import static javax.persistence.EnumType.*;

@Entity
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @Email
    private String email;
    private String description;
    private LocalDateTime date;
    // TODO: 12/07/2022 Arrumar a data
    @Enumerated(STRING)
    private Genre genre;
    private String nationality;
    private boolean alive;

    @OneToMany
    @JoinColumn(name = "author_id")
    private List<Book> book;

}
