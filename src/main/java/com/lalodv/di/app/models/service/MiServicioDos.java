package com.lalodv.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component("MiServicioComplejo") // @Service tambien se puede usar en lugar de @Component
@Primary // Con esto se le da la preferencia a esta clase para ser ejecutada por el @Autowired
public class MiServicioDos implements IServicio{

    @Override
    public String operacion() {
        return "ejecutando algun proceso importante complejo...";
    }
}
