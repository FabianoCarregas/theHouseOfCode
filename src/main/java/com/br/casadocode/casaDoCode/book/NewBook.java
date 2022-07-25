package com.br.casadocode.casaDoCode.book;

import com.br.casadocode.casaDoCode.enun.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@AllArgsConstructor
@Getter
public class NewBook {

    @NotBlank
    private String name;
    private String image;
    private Genre bookGenre;
    @NotNull
    private double price;
    @NotBlank
    private String launch;

    public Book toEntity() {
        return new Book(
                null,
                this.name,
                this.image,
                this.bookGenre,
                this.price,
                this.launch);
    }

}
