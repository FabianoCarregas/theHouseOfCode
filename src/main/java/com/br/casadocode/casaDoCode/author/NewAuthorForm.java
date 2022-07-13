package com.br.casadocode.casaDoCode.author;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

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

    public Author toEntity() {
        return new Author(
                null,
                this.name,
                this.email,
                this.description,
                this.date = LocalDateTime.now());
    }
}
