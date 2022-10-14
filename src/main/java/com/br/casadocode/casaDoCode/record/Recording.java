package com.br.casadocode.casaDoCode.record;

import com.br.casadocode.casaDoCode.book.Book;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import javax.persistence.*;

import java.util.List;

import static org.joda.time.DateTime.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Recording {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Book> books;

    private DateTime date = now();
}
