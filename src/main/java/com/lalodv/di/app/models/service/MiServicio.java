package com.lalodv.di.app.models.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("MiServicio") // @Service tambien se puede usar en lugar de @Component
public class MiServicio implements IServicio{

    @Override
    public String operacion() {
        return "ejecutando algun proceso importante...";
    }
}
