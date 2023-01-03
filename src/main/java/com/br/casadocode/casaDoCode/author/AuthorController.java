package com.br.casadocode.casaDoCode.author;
import com.br.casadocode.casaDoCode.enums.Country;
import com.br.casadocode.casaDoCode.enums.Genre;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorRepository repository;

    @GetMapping("/author")
    public String create(NewAuthorForm newAuthorForm, Model model) {

        model.addAttribute("genres", Genre.values());
        model.addAttribute("countries" , Country.values());
        model.addAttribute("newAuthorForm", newAuthorForm);
        return "author/newAuthor";
    }

    @PostMapping("/new/author")
    public String save(@Valid NewAuthorForm form, BindingResult result, Model model){
        if (result.hasErrors()) {
            return create(form, model);
        }
        repository.save(form.toEntity());
        return "redirect:/authors";
    }

    @GetMapping("/authors")
    public String listAll(Model model) {
        List<Author> authors = repository.findAll();

        model.addAttribute("authors", authors);
        return "author/authorsList";
    }

}