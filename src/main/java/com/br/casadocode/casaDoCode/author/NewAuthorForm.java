package com.br.casadocode.casaDoCode.author;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.type.LocalDateTimeType;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
