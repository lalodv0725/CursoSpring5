package com.lalodv.di.app;

import com.lalodv.di.app.models.domain.ItemFactura;
import com.lalodv.di.app.models.domain.Producto;
import com.lalodv.di.app.models.service.IServicio;
import com.lalodv.di.app.models.service.MiServicio;
import com.lalodv.di.app.models.service.MiServicioDos;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

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

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItemsFactura (){
        Producto productoUno = new Producto("Fifa 21", 750);
        Producto productoDos = new Producto("GTA 5", 1100);

        ItemFactura lineaItemUno = new ItemFactura(productoUno,2);
        ItemFactura lineaItemDos = new ItemFactura(productoDos,3);

        List ItemsFactura = Arrays.asList(lineaItemUno,lineaItemDos);

        return  ItemsFactura;
    }

    @Bean("itemsFacturaOficina")
    @Primary
    public List<ItemFactura> registrarItemsFacturaOficina (){
        Producto productoUno = new Producto("Camara", 550);
        Producto productoDos = new Producto("Notebook Asus", 1000);
        Producto productoTres = new Producto("Teclado Razer", 800);
        Producto productoCuatro = new Producto("Mouse Logi", 100);

        ItemFactura lineaItemUno = new ItemFactura(productoUno,2);
        ItemFactura lineaItemDos = new ItemFactura(productoDos,1);
        ItemFactura lineaItemTres = new ItemFactura(productoTres,1);
        ItemFactura lineaItemCauatro = new ItemFactura(productoCuatro,2);

        List ItemsFactura = Arrays.asList(lineaItemUno,lineaItemDos, lineaItemTres, lineaItemCauatro);

        return  ItemsFactura;
    }
}
