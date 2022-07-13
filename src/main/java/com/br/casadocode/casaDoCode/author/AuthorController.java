package com.br.casadocode.casaDoCode.author;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@AllArgsConstructor
public class AuthorController {

    private final AuthorRepository repository;

    @GetMapping("admin/author")
    public String listAll(Model model) {
        List<Author> authors = repository.findAll();
        model.addAttribute("authors", authors);
        return "author/listAuthors";
    }

    @GetMapping("/admin/new/author/form")
    public String create(NewAuthorForm form) {
        return "author/newAuthor";
    }

    @PostMapping("admin/new/author")
    public String create(@Valid NewAuthorForm form, BindingResult result, Model model){
        if(result.hasErrors()) {
            return create(form);
        }
        Author author = form.toEntity();
        repository.save(author);
        return "redirect:/admin/author";
    }

}
