package com.br.casadocode.casaDoCode.book;

import com.br.casadocode.casaDoCode.author.Author;
import com.br.casadocode.casaDoCode.author.AuthorRepository;
import com.br.casadocode.casaDoCode.enums.Genre;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@AllArgsConstructor
public class BookController {

    private final BookRepository repository;
    private final AuthorRepository authorRepository;

    @GetMapping("/book")
    public String create(NewBookForm newBookForm, Model model) {
        List<Author> authors = authorRepository.findAll();

        model.addAttribute("genres", Genre.values());
        model.addAttribute("authors", authors);
        return "book/newBook";
    }

    @PostMapping("/new/book")
    public String save(@Valid NewBookForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return create(form, model);
        }
        repository.save(form.toEntity());
        return "redirect:/books";
    }

    @GetMapping("/books")
    public String listAll(Model model) {
        List<Book> books = repository.findAll();

        model.addAttribute("books", books);
        return "book/booksList";
    }

}
