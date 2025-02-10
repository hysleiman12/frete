package br.com.devh12.frete.services;

import org.springframework.stereotype.Service;

@Service
public class OrderService {


    private ShippingServices shippingServices;


    public OrderService(ShippingServices shippingServices) {
        this.shippingServices = shippingServices;
    }

    public double total(Order order){


        return shippingServices.shipment(order);
       // return  Double.parseDouble("Pedido código: "+ order.getCodigo() +"\nValor Total :"+ shippingServices.shipment(order));

    }
}
