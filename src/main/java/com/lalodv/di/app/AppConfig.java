package com.lalodv.di.app;

import com.lalodv.di.app.models.service.IServicio;
import com.lalodv.di.app.models.service.MiServicio;
import com.lalodv.di.app.models.service.MiServicioDos;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {


    @Bean("MiServicioSimple")
    public IServicio componenteServicioSimple () {
        return new MiServicio();
    }

    @Primary
    @Bean ("MiServicioComplejo")
    public IServicio componenteServicioComplejo () {
        return new MiServicioDos();
    }
}
