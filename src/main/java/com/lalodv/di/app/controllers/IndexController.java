package com.lalodv.di.app.controllers;

import com.lalodv.di.app.models.service.IServicio;
import com.lalodv.di.app.models.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private IServicio servicio;
    //private MiServicio servicio = new MiServicio();

//    @Autowired
//    public IndexController(IServicio servicio) {
//        this.servicio = servicio;
//    }
    @Autowired
    @Qualifier("MiServicioSimple")
    private IServicio servicioSimple;

    @GetMapping({"/", "index", "/inicio", ""})
    public String index(Model model){
        model.addAttribute("objetoServicio", servicio.operacion());
        model.addAttribute("objetoServicioSimple", servicioSimple.operacion());
        model.addAttribute("titulo","Pasando datos del servicio(modelo) a la vista");
        return "index";
    }

    //@Autowired
    //public void setServicio(IServicio servicio) {
    //    this.servicio = servicio;
    //}
}
