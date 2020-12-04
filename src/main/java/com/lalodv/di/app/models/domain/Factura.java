package com.lalodv.di.app.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;
import java.util.List;

@Component
@RequestScope
public class Factura implements Serializable{

	private static final long serialVersionUID = -2241032502840488501L;

	@Autowired
    private Cliente cliente;

    @Value("${factura.descripcion}")
    private String descripcion;

    @Autowired
    //@Qualifier("itemsFactura")
    private List<ItemFactura> items;

    @PostConstruct
    public void inicializarFactura(){
        cliente.setNombre(cliente.getNombre().concat(" ").concat("Polar"));
        descripcion = descripcion.concat(" del cliente ").concat(cliente.getNombre());
    }

    @PreDestroy
    public void destruirFactura(){
        System.out.println("Factura DESTRUIDA!!" + descripcion);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<ItemFactura> getItems() {
        return items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }

}
