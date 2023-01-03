package com.br.casadocode.casaDoCode.record;

import com.br.casadocode.casaDoCode.author.Author;
import com.br.casadocode.casaDoCode.book.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.joda.time.DateTime;
import javax.persistence.*;
import static org.joda.time.DateTime.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recording {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Book book;

    @ManyToOne
    private Author author;

    private DateTime date = now();
}
