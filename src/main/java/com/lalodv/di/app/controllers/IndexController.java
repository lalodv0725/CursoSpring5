package com.lalodv.di.app.controllers;

import com.lalodv.di.app.models.service.MiServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private MiServicio servicio = new MiServicio();

    @GetMapping({"/", "index", "/inicio", ""})
    public String index(Model model){
        model.addAttribute("objetoServicio", servicio.operacion());
        model.addAttribute("titulo","Pasando datos del servicio(modelo) a la vista");
        return "index";
    }

}
