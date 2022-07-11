package com.br.casadocode.casaDoCode.author;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@AllArgsConstructor
public class AuthorController {

    private final AuthorRepository repository;

    @PostMapping("/author")
    public String create(@RequestBody @Valid NewAuthorForm form){
        repository.save(form.toEntity());
        return "ok";
    }

}
