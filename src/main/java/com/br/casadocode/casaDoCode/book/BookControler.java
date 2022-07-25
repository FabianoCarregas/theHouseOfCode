package com.br.casadocode.casaDoCode.book;

import com.br.casadocode.casaDoCode.enun.Genre;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@AllArgsConstructor
public class BookControler {

    private final BookRepository repository;

    @GetMapping("admin/books")
    public String listAll(Model model) {
        List<Book> books = repository.findAll();
        model.addAttribute("books", books);
        return "book/listBooks";
    }

    @GetMapping("admin/newbook")
    public String create(Model model) {
        model.addAttribute("genres", new ArrayList<Genre>(Arrays.asList(Genre.values())));
        return "book/newBook";
    }

    @PostMapping("admin/newbook/save")
    public String save(@Valid NewBook form, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return create(model);
        }
        Book book = form.toEntity();
        repository.save(book);
        return "book/listBooks";
    }

}
