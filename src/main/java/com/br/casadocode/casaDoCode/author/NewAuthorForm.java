package com.br.casadocode.casaDoCode.author;

import com.br.casadocode.casaDoCode.enums.Country;
import com.br.casadocode.casaDoCode.enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewAuthorForm {

    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String description;
    private Genre genre;
    private Country country;

    public Author toEntity() {
        return new Author(name, email, description, genre, country);
    }
}
