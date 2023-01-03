package com.br.casadocode.casaDoCode.mainPageAdmin;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class MainPageAdminController {

    @GetMapping("/main/page/admin")
    public String get(Model model) {
        return "mainAdm/mainAdmDash";
    }
}
