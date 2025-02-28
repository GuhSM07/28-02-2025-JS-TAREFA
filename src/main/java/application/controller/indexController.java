package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class indexController {
    @RequestMapping("/")
    public String nome(){
        return "index";
    }

    @RequestMapping("/mensagem")
    public String mensagem(@RequestParam int opcao, Model ui){
        String texto="";
        switch (opcao) {
            case 1:
                texto = "Bom dia";
                break;
              
            case 2:
                texto = "Boa tarde";
                break;
            case 3:
                texto = "Boa noite";
                break;

            default:
                texto = "Ola";
                break;
        }
        ui.addAttribute("texto", texto);
        return "mensagem";
    }
}