package com.lalodv.di.app.controllers;

import com.lalodv.di.app.models.domain.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    Factura factura;

    @GetMapping("/ver")
    public String verFactura(Model model){

        model.addAttribute("titulo", "Ejemplo Factura con Inyeccion de Dependencias");
        model.addAttribute("factura",factura);

        return "factura/ver";
    }

}
