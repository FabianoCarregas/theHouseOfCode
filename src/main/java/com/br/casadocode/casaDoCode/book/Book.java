package com.br.casadocode.casaDoCode.book;

import com.br.casadocode.casaDoCode.enun.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    private String image;
    private Genre bookGenre;
    private double price;
    private String launch;
}
